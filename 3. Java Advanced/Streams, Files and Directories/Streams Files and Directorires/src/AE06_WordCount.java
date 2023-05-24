import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class AE06_WordCount {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        BufferedReader reader = new BufferedReader(new FileReader(pathIn));

        String pathOut = "C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\results.txt";
        PrintWriter writer = new PrintWriter( new FileWriter(pathOut));

        String line = reader.readLine();

        Map<StringBuilder, Integer> wordsCount = new TreeMap<>();

        StringBuilder word = new StringBuilder();

        while (line != null) {
            char currentChar;
            for (int i = 0; i < line.length(); i++) {
                currentChar = line.charAt(i);
                if ((currentChar >= 65 && currentChar <= 90) || (currentChar >= 97 && currentChar <= 122)) {
                    word.append(currentChar);
                } else if (currentChar == ' ' && word.length() > 0) {
                    addToMap(wordsCount, word);
                    word = new StringBuilder();
                }
            }
            line = reader.readLine();
        }

        addToMap(wordsCount, word);

        writer.close();
        reader.close();

        for (Map.Entry<StringBuilder, Integer> entry : wordsCount.entrySet()) {
            writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
        }
    }

    private static void addToMap(Map<StringBuilder, Integer> wordsCount, StringBuilder word) {
        if (!wordsCount.containsKey(word)) {
            wordsCount.put(word, 1);
        } else {
            int newValue = wordsCount.get(word) + 1;
            wordsCount.put(word, newValue);
        }
    }
}
