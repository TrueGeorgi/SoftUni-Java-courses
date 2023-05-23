import java.io.*;

public class A05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String pathInput = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(pathInput));

        String pathOutput = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\Files-and-Streams\\Exercise 5";
        PrintWriter writer = new PrintWriter(new FileWriter(pathOutput));

        String line = reader.readLine();
        int count = 1;

        while (line != null) {

            if (count % 3 == 0) {
                writer.write(line + "\n");
            }

            line = reader.readLine();
            count++;
        }

        reader.close();
        writer.close();
    }
}
