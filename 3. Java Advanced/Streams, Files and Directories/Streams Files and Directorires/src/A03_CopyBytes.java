import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A03_CopyBytes {
    public static void main(String[] args) throws IOException {
        String pathInput = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(pathInput);

        String fileOutput = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\Files-and-Streams\\Exercise 3.txt";
        FileOutputStream outputStream = new FileOutputStream(fileOutput);

        int oneByte = inputStream.read();


        while (oneByte >= 0) {
            char symbol = (char) oneByte;
            String digits = String.valueOf((int) symbol);

            if (!digits.equals("10") && !digits.equals("32")) {
                for (int i = 0; i < digits.length(); i++) {
                    outputStream.write(digits.charAt(i));
                }
            } else {
                outputStream.write(oneByte);
            }

            oneByte = inputStream.read();
        }
        inputStream.close();
        outputStream.close();
    }
}
