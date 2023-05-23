import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\Files-and-Streams\\test.txt");

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\Files-and-Streams\\test2.txt");

        int oneByte = inputStream.read();
        while (oneByte >= 0) {
            outputStream.write(oneByte);
            oneByte = inputStream.read();
        }

        inputStream.close();
        outputStream.close();

    }
}
