import java.util.*;

public class A08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> employees = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];

            if (!employees.containsKey(company)) {
                employees.put(company, new ArrayList<>());
            }
            if (!employees.get(company).contains(id)) {
                List<String> currentEmployee = employees.get(company);
                currentEmployee.add(id);
                employees.put(company, currentEmployee);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> company : employees.entrySet()) {
            System.out.printf("%s%n", company.getKey());
            for (String id : company.getValue()) {
                System.out.printf("-- %s%n", id);
            }
        }
    }
}
