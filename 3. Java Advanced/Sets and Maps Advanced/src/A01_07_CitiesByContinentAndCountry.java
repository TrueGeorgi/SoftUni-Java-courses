import java.util.*;

public class A01_07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        int spins = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < spins; i++) {

            String[] input = scanner.nextLine().split(" ");

            String continent = input[0];
            String country = input[1];
            String city = input[2];

            if (!continents.containsKey(continent)) {
                continents.put(continent, new LinkedHashMap<>());
            }

            if (!continents.get(continent).containsKey(country)) {
                continents.get(continent).put(country, new ArrayList<>());
            }

            continents.get(continent).get(country).add(city);
        }

        for (Map.Entry<String, Map<String, List<String>>> entry : continents.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, List<String>> entry1 : entry.getValue().entrySet()) {
                StringBuilder citiesOutput = new StringBuilder();
                for (String city : entry1.getValue()) {
                    citiesOutput.append(city).append(", ");
                }
                citiesOutput.setLength(citiesOutput.length() - 2);
                System.out.println("  " + entry1.getKey() + " -> " + citiesOutput.toString());
            }
        }
    }
}
