import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AE02_SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line = reader.readLine();

        long sum = 0;

        while (line != null) {

            char currentChar;

            for (int i = 0; i < line.length(); i++) {
                currentChar = line.charAt(i);
                sum += currentChar;
            }
            line = reader.readLine();
        }

        System.out.println(sum);
    }
}
