import java.io.*;
import java.util.Scanner;

public class AE03_AllCapitals {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(pathIn));

        String pathOut = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        PrintWriter writer = new PrintWriter(new FileWriter(pathOut));

        String line = reader.readLine();

        while (line != null) {
            writer.write(line.toUpperCase() + "\n");

            line = reader.readLine();
        }

        reader.close();
        writer.close();
    }
}
