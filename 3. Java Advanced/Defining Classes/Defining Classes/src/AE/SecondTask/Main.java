package AE.SecondTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spins = Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> departments = new HashMap<>();

        while (spins-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            if (!departments.containsKey(department)) {
                departments.put(department, new ArrayList<>());
            }

            int inputLength = input.length;

            switch (inputLength) {
                case 4:
                    Employee employee = new Employee(name, salary, position, department);
                    departments.get(department).add(employee);
                    break;
                case 5:
                    if (input[4].contains("@")) {
                        String email = input[4];
                        employee = new Employee(name, salary, position, department, email);
                    } else {
                        int age = Integer.parseInt(input[4]);
                        employee = new Employee(name, salary, position, department, age);
                    }
                    departments.get(department).add(employee);
                    break;
                case 6:
                    String email = input[4];
                    int age = Integer.parseInt(input[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    departments.get(department).add(employee);
                    break;
            }
        }
        String highestAverageSalaryDepartment = "";
        double highestAverageSalary = -1;

        for (Map.Entry<String, List<Employee>> entry : departments.entrySet()) {
            int numberOfEmployees = entry.getValue().size();
            double totalSalary = 0;
            for (Employee employee : entry.getValue()) {
                totalSalary += employee.getSalary();
            }
            double averageSalary = totalSalary / numberOfEmployees;

            if (averageSalary > highestAverageSalary) {
                highestAverageSalaryDepartment = entry.getKey();
                highestAverageSalary = averageSalary;
            }
        }

        departments.get(highestAverageSalaryDepartment).sort(Comparator.comparing(Employee::getSalary).reversed());

        System.out.println("Highest Average Salary: " + highestAverageSalaryDepartment);

        for (Employee employee : departments.get(highestAverageSalaryDepartment)) {
            System.out.println(employee.toString());
        }
    }
}
