import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A05_Students {
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

        public String getHometown() {
            return hometown;
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
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> schoolList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] inputArr = input.split(" ");
            String firstName = inputArr[0];
            String secondName = inputArr[1];
            String age = inputArr[2];
            String hometown = inputArr[3];

            Student student = new Student(firstName, secondName, age, hometown);

            schoolList.add(student);

            input = scanner.nextLine();
        }

        String demandCity = scanner.nextLine();

        for (Student currentStudent : schoolList) {
            String currentHometown = currentStudent.getHometown();
            if (currentHometown.equals(demandCity)) {
                System.out.printf("%s %s is %s years old%n",
                        currentStudent.getFirstName(),
                        currentStudent.getSecondName(),
                        currentStudent.getAge());
            }
        }
    }
}
