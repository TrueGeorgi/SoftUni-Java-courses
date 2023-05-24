import java.io.*;

public class AE07_MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String pathInFileOne = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathInFileTwo = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String pathOutput = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader readerOne = new BufferedReader(new FileReader(pathInFileOne));
        BufferedReader readerTwo = new BufferedReader(new FileReader(pathInFileTwo));
        PrintWriter writer = new PrintWriter(new FileWriter(pathOutput));

        String line = readerOne.readLine();

        write(readerOne, writer, line);

        readerOne.close();

        line = readerTwo.readLine();

        write(readerTwo, writer, line);

        readerTwo.close();
        writer.close();
    }

    private static void write(BufferedReader readerOne, PrintWriter writer, String line) throws IOException {
        while (line != null) {

            writer.write(line + "\n");

            line = readerOne.readLine();
        }
    }
}
