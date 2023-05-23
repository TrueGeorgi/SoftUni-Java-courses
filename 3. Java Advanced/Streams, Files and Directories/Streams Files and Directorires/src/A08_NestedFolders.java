import java.io.File;

public class A08_NestedFolders {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\Files-and-Streams");

        int folders = 0;

        if (file.exists()) {
            if (file.isDirectory()) {
                folders++;
                File[] files = file.listFiles();
                for (File f : files) {
                    File file1 = new File(f.getPath());
                    if (!f.isDirectory()) {
                        System.out.printf("%s%n", f.getName());
                    } else {
                        folders++;
                        File[] files1 = file1.listFiles();
                        for (File f1 : files1) {
                            File file2 = new File(f.getPath());
                            if (!f1.isDirectory()) {
                                System.out.printf("%s%n", f1.getName());
                            } else {
                                folders++;
                                File[] files2 = file2.listFiles();
                                for (File f2 : files2) {
                                    if (!f2.isDirectory()) {
                                        System.out.printf("%s%n", f2.getName());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(folders + " folders");
    }
}
