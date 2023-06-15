import java.util.*;

public class A01_SantasPresentFactory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] materialsInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] magicLevelInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Map<String, Integer> shop = new LinkedHashMap<>();

        Map<String, Integer> craftedToys = new TreeMap<>();

        shop.put("Doll", 150);
        shop.put("Wooden train", 250);
        shop.put("Teddy bear", 300);
        shop.put("Bicycle", 400);

        ArrayDeque<Integer> stackMaterials = new ArrayDeque<>();

        for (int material : materialsInput) {
            stackMaterials.push(material);
        }

        ArrayDeque<Integer> queueMagicLevel = new ArrayDeque<>();

        for (int magicLevel : magicLevelInput) {
            queueMagicLevel.offer(magicLevel);
        }

        while (!stackMaterials.isEmpty() && !queueMagicLevel.isEmpty()) {
            int totalMagic = stackMaterials.peek() * queueMagicLevel.peek();

            boolean match = false;

            for (Map.Entry<String, Integer> entry : shop.entrySet()) {

                if (entry.getValue() == totalMagic) {
                    if (craftedToys.containsKey(entry.getKey())) {
                        craftedToys.put(entry.getKey(), craftedToys.get(entry.getKey()) + 1);
                    } else {
                        craftedToys.put(entry.getKey(), 1);
                    }

                    stackMaterials.pop();
                    queueMagicLevel.poll();
                    match = true;
                    break;
                }
            }

            if (!match && totalMagic < 0) {

                int result = stackMaterials.pop() + queueMagicLevel.poll();
                stackMaterials.push(result);

            } else if (!match && totalMagic > 0) {

                int newValueMaterial = stackMaterials.pop() + 15;
                stackMaterials.push(newValueMaterial);
                queueMagicLevel.poll();

            } else if (!match && (stackMaterials.peek() == 0 || queueMagicLevel.peek() == 0)) {

                if (stackMaterials.peek() == 0) {
                    stackMaterials.pop();
                }

                if (queueMagicLevel.peek() == 0) {
                    queueMagicLevel.poll();
                }
            }
        }

        if ((craftedToys.containsKey("Doll") && craftedToys.containsKey("Wooden train")
        || (craftedToys.containsKey("Teddy bear") && craftedToys.containsKey("Bicycle")))) {
            System.out.println("The presents are crafted! Merry Christmas!");
        } else {
            System.out.println("No presents this Christmas!");
        }

        List<String> outputList = new ArrayList<>();

        if (!stackMaterials.isEmpty()) {
            while (!stackMaterials.isEmpty()) {
                outputList.add(String.valueOf(stackMaterials.pop()));
            }

            String output = "Materials left: " + String.join(", ", outputList);

            System.out.println(output);
        }

        if (!queueMagicLevel.isEmpty()) {

         while (!queueMagicLevel.isEmpty()) {
             outputList.add(String.valueOf(queueMagicLevel.poll()));
         }

         String output = "Magic left: " + String.join(", ", outputList);

         System.out.println(output);

        }

        for (Map.Entry<String, Integer> entry : craftedToys.entrySet())  {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
