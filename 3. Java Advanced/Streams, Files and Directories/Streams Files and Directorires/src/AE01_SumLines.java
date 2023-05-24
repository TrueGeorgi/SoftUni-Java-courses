import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AE01_SumLines {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(pathIn));

        String line = reader.readLine();

        long totalSum = 0;

        while (line != null) {
            int sum = 0;
            char currentChar;
            for (int i = 0; i < line.length(); i++) {
                currentChar = line.charAt(i);
                sum += currentChar;
            }

            totalSum += sum;
            System.out.println(sum);
            line = reader.readLine();
        }
        System.out.println();
        System.out.println(totalSum);
    }
}
