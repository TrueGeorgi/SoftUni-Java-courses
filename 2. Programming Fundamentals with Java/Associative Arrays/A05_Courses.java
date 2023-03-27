import java.util.*;

public class A05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String currentCourse = input.split(" : ")[0];
            String currentStudent = input.split(" : ")[1];

            if (!courses.containsKey(currentCourse)) {
                courses.put(currentCourse, new ArrayList<>());
            }
            List<String> currentList = courses.get(currentCourse);
            currentList.add(currentStudent);
            courses.put(currentCourse, currentList);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            int numCourses = entry.getValue().size();
            System.out.printf("%s: %d%n", entry.getKey(), numCourses);
            for (String student : entry.getValue()) {
                System.out.printf("-- %s%n", student);
            }
        }
    }
}
