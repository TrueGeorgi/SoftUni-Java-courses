import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courses = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String command = input.split(":")[0];

            String lesson = "";
            int index = 0;

            switch (command) {
                case "Add":
                    lesson = input.split(":")[1];
                    if (!courses.contains(lesson)) {
                        courses.add(lesson);
                    }
                    break;
                case "Insert":
                    lesson = input.split(":")[1];
                    index = Integer.parseInt(input.split(":")[2]);
                    if (!courses.contains(lesson)
                    && index < courses.size()
                    && index >= 0) {
                        courses.add(index, lesson);
                    }
                    break;
                case "Remove":
                    lesson = input.split(":")[1];
                    for (int i = 0; i < courses.size(); i++) {
                        if (courses.get(i).contains(lesson)) {
                            courses.remove(i);
                        }
                    }
                    break;
                case "Swap":
                    lesson = input.split(":")[1];
                    String lessonTwo = input.split(":")[2];
                    int lessonIndex = -1;
                    int lessonTwoIndex = -1;
                    for (int i = 0; i < courses.size(); i++) {
                        if (courses.get(i).contains(lesson)) {
                            lessonIndex = i;
                            lesson = courses.get(i);
                            break;
                        }
                    }
                    for (int i = 0; i < courses.size(); i++) {
                        if (courses.get(i).contains(lessonTwo)) {
                            lessonTwoIndex = i;
                            lessonTwo = courses.get(i);
                            break;
                        }
                    }
                    courses.set(lessonTwoIndex, lesson);
                    courses.set(lessonIndex, lessonTwo);
                    break;
                case "Exercise":
                    lesson = input.split(":")[1];
                    String newString = lesson + ":Exercise";
                    boolean exists = false;
                    for (int i = 0; i < courses.size(); i++) {
                        if (courses.get(i).equals(lesson) && !courses.get(i).contains(":Exercise")) {
                            courses.set(i, newString);
                            exists = true;
                            break;
                        }
                    }
                    if (!exists && !courses.contains(lesson + ":Exercise")) {
                        courses.add(lesson + ":Exercise");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < courses.size(); i++) {
            String checkCourse = courses.get(i);
            if (checkCourse.contains("Exercise")) {
                String lesson = checkCourse.split(":")[0];
                String exercise = lesson + "-Exercise";
                courses.set(i, lesson);
                courses.add(i+1, exercise);
                i++;
            }
        }
        for (int i = 0; i < courses.size(); i++) {
            System.out.printf("%d.%s%n", i+1, courses.get(i));
        }
    }
}
