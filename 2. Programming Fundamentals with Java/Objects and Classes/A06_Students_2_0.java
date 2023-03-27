import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A06_Students_2_0 {
    static class Student {
        String firstName;
        String secondName;
        String age;
        String hometown;

        public Student (String firstName, String secondName, String age, String hometown) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public String getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] inputArr = input.split(" ");

            String firstName = inputArr[0];
            String secondName = inputArr[1];
            String age = inputArr[2];
            String hometown = inputArr[3];

            boolean exists = false;

            Student student = new Student(firstName, secondName, age, hometown);

            for (int i = 0; i < studentList.size(); i++) {
                if (firstName.equals(studentList.get(i).getFirstName())
                        && secondName.equals(studentList.get(i).getSecondName())) {
                    exists = true;
                    studentList.set(i, student);
                }
            }
            if (!exists) {
                studentList.add(student);
            }
            input = scanner.nextLine();
        }
        String demandCity = scanner.nextLine();

        for (Student student : studentList) {
            String currentCity = student.getHometown();
            if (currentCity.equals(demandCity)) {
                System.out.printf("%s %s is %s years old%n",
                        student.getFirstName(),
                        student.getSecondName(),
                        student.getAge());
            }
        }
    }
}
