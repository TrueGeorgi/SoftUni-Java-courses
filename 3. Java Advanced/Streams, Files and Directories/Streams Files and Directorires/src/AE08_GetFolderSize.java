import java.io.File;

public class AE08_GetFolderSize {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");

        int size = 0;

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    size += files[i].length();
                }
            }
        }

        System.out.printf("Folder size: %d",size);
    }
}
