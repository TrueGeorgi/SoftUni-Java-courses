import java.io.File;
import java.util.ArrayDeque;

public class A08_NestedFolders {
    public static void main(String[] args) {

        File root = new File("C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\Files-and-Streams");

        ArrayDeque<File> directories = new ArrayDeque<>();

        directories.offer(root);

        int count = 0;

        while (!directories.isEmpty()) {
            File current = directories.poll();
            File[] nestedFiles = current.listFiles();
            for (File fileOne : nestedFiles) {
                if (fileOne.isDirectory()) {
                    directories.offer(fileOne);
                }
            }
            count++;
            System.out.println(current.getName());
        }
        System.out.printf("%d folders\n", count);
    }
}
