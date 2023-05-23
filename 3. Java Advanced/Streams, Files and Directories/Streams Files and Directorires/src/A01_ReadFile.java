import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A01_ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        int oneByte = inputStream.read();

        while (oneByte >= 0) {

            System.out.print(Integer.toBinaryString(oneByte) + " ");

            oneByte = inputStream.read();
        }

        inputStream.close();
    }
}
