import java.io.*;

public class AE04_CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(pathIn));

        String pathOut = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        PrintWriter writer = new PrintWriter( new FileWriter(pathOut));

        String line = reader.readLine();

        int vowels = 0;
        int punctuation = 0;
        int otherSymbols = 0;
        int whitespace = 0;

        while (line != null) {

            char currentChar;

            for (int i = 0; i < line.length(); i++) {
                currentChar = line.charAt(i);
                switch (currentChar) {
                    case 'a', 'e', 'i', 'o', 'u' -> vowels++;
                    case '!', ',', '.', '?' -> punctuation++;
                    case ' ' -> whitespace++;
                    default -> otherSymbols++;
                }
            }

            line = reader.readLine();
        }

        System.out.printf("Vowels: %d%n" +
                "Other symbols: %d%n" +
                "Punctuation: %d", vowels, otherSymbols, punctuation);
    }
}
