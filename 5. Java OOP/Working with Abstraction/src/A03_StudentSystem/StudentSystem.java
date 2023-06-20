package A03_StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private final Map<String, Student> studentsList;

    public StudentSystem() {
        this.studentsList = new HashMap<>();
    }

    public void ParseCommand(String[] input) {

        String name = input[1];

        if (input[0].equals("Create")) {
            int age = Integer.parseInt(input[2]);
            double grade = Double.parseDouble(input[3]);

            if (!studentsList.containsKey(name)) {
                Student student = new Student(name, age, grade);
                studentsList.put(name, student);
            }

        } else if (input[0].equals("Show")) {

            if (studentsList.containsKey(name)) {
                Student student = studentsList.get(name);

                System.out.println(showStudentsInfo(student));
            }
        }
    }

    private static String showStudentsInfo(Student student) {
        String view = String.format("%s is %d years old.", student.getName(), student.getAge());

        if (student.getGrade() >= 5.00) {
            view += " Excellent student.";
        } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            view += " Average student.";
        } else {
            view += " Very nice person.";
        }
        return view;
    }
}
