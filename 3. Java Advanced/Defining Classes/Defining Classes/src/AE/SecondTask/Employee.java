package AE.SecondTask;

public class Employee {

    private String name;

    private double salary;

    String position;

    String department;

    String email;

    int age;

                                          // Constructors

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = -1;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

                                  // Setters
                                  // Getters

    public double getSalary() {
        return salary;
    }

    // Other methods

    @Override
    public String toString() {
       return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}
