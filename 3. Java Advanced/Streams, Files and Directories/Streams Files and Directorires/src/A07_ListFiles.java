import java.io.File;

public class A07_ListFiles {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\Files-and-Streams");

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: [%d]%n", f.getName(), f.length());
                }
                }
            }
        }
    }
}

