package A03_ValidationData;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("The first name must be at least 3 symbols long");
        }

        this.firstName = firstName;
    }

    public void setAge (int age) {
        if (age < 1) {
            throw new IllegalArgumentException("The age cannot be less than 1");
        }

        this.age = age;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("The last name must be at least 3 symbols long");
        }

        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary (double bonus) {
        if (this.age < 30) {
            bonus /= 2;
        }
        this.salary += this.salary * (bonus / 100);
    }


    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.0############");
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, format.format(salary));
    }
}
