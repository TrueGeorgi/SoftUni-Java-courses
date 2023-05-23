import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A06_SortLines {

    public static void main(String[] args) throws IOException {
        Path pathRead = Paths.get("C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\input.txt");
        Path pathWrite = Paths.get("C:\\Users\\georg\\Desktop\\Programing\\GitHub\\SoftUni-Java-courses\\3. Java Advanced\\Streams, Files and Directories\\Streams Files and Directorires\\Resources\\Files-and-Streams\\Exercise 6.txt");
        List<String> lines = Files.readAllLines(pathRead);
        Collections.sort(lines);
        Files.write(pathWrite, lines);
    }
}
