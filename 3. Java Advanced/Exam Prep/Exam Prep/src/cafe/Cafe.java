package cafe;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

    private String name;

    private int capacity;

    private List<Employee> employeesList;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employeesList = new ArrayList<>();
    }

    public void addEmployee (Employee employee) {
        employeesList.add(employee);
    }

    public boolean removeEmployee (String name) {
        for (Employee employee : employeesList) {
            if (employee.getName().equals(name)) {
                employeesList.remove(employee);
                return true;
            }
        }
        return false;
    }

    public Employee returnOldestEmployee () {
        Employee oldest = null;
        int oldestAge = -1;

        for (Employee employee : employeesList) {
            if (employee.getAge() > oldestAge) {
                oldest = employee;
                oldestAge = employee.getAge();
            }
        }

        return oldest;
    }

    public Employee getEmployee (String name) {
        for (Employee employee : employeesList) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount () {
        return employeesList.size();
    }

    public String report() {
        StringBuilder output = new StringBuilder("Employees working at a Cafe " + this.name + ":" + "\n");
        employeesList.forEach(e -> output.append(e).append("\n"));
        return String.valueOf(output);
    }
}
