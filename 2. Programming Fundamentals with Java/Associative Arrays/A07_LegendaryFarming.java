import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isWin = false;
        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junk = new LinkedHashMap<>();
        String wonItem = "";

        while (!isWin) {
            String input = scanner.nextLine();

            String[] inputArray = input.split("\\s+");

            for (int i = 0; i < inputArray.length; i += 2) {
                int quantity = Integer.parseInt(inputArray[i]);
                String item = inputArray[i + 1].toLowerCase();
                switch (item) {
                    case "shards":
                    case "fragments":
                    case "motes":
                        if (!materials.containsKey(item)) {
                            materials.put(item, quantity);
                        } else {
                            materials.put(item, materials.get(item) + quantity);
                        }
                        break;
                    default:
                        if (!junk.containsKey(item)) {
                            junk.put(item, quantity);
                        } else {
                            junk.put(item, junk.get(item) + quantity);
                        }
                }
                if (materials.get("shards") >= 250) {
                    materials.put("shards", materials.get("shards") - 250);
                    wonItem = "Shadowmourne";
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    materials.put("fragments", materials.get("fragments") - 250);
                    wonItem = "Valanyr";
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    materials.put("motes", materials.get("motes") - 250);
                    wonItem = "Dragonwrath";
                    isWin = true;
                    break;
                }
            }
        }
        System.out.printf("%s obtained!%n", wonItem);
        materials.entrySet().forEach(material -> System.out.printf("%s: %d%n", material.getKey(), material.getValue()));
        junk.entrySet().forEach(material -> System.out.printf("%s: %d%n", material.getKey(), material.getValue()));
    }
}
