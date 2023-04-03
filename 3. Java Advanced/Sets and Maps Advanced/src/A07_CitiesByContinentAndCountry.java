import java.util.*;
import java.util.stream.Collectors;

public class A07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String continent = input.split("\\s+")[0];
            String country = input.split("\\s+")[1];
            String town = input.split("\\s+")[2];

            if (!continents.containsKey(continent)) {
                continents.put(continent, new LinkedHashMap<>());
            }

            Map<String, List<String>> countries = continents.get(continent);

            if (!countries.containsKey(country)) {
                countries.put(country, new ArrayList<>());
            }

            List<String> towns = countries.get(country);
            towns.add(town);
        }
        for (Map.Entry<String, Map<String, List<String>>> continent : continents.entrySet()) {
            System.out.println(continent.getKey() + ": ");
            for (Map.Entry<String, List<String>> country : continent.getValue().entrySet()) {
                String outputTowns = String.join(", ", country.getValue());
                System.out.println(" " + country.getKey() + " -> " + outputTowns);
            }
        }
    }
}
