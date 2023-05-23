import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A02_WriteToFile {
    public static void main(String[] args) throws IOException {

        String pathInput = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(pathInput);

        String fileOutput = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\Files-and-Streams\\output.txt";
        FileOutputStream outputStream = new FileOutputStream(fileOutput);

        int oneByte = inputStream.read();

        while (oneByte >= 0) {
            char currentChar = (char) oneByte;
            if (currentChar != ',' && currentChar != '.' && currentChar != '!' && currentChar != '?') {
                outputStream.write(currentChar);
            }
                oneByte = inputStream.read();
        }

        inputStream.close();
        outputStream.close();
    }
}
