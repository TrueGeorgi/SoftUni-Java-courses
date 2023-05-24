import java.io.*;

public class AE05_LineNumbers {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        BufferedReader reader = new BufferedReader(new FileReader(pathIn));

        String pathOut = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        PrintWriter writer = new PrintWriter( new FileWriter(pathOut));

        String line = reader.readLine();

        int count = 1;

        while (line != null) {
            writer.write(count + ". " + line + "\n");

            line = reader.readLine();
            count++;
        }
        writer.close();
        reader.close();
    }
}
