import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A04_ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        Scanner reader = new Scanner(inputStream);

        while (reader.hasNext()) {
            if (reader.hasNextInt()) {
                System.out.println(reader.nextInt());
            }
            reader.next();
        }
    }
}
