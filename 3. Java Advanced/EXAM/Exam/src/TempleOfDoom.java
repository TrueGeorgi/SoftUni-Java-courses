import java.util.*;
import java.util.stream.Collectors;

public class TempleOfDoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lineOne = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] lineTwo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] challengesArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        ArrayDeque<Integer> tools = new ArrayDeque<>(); //FIFO
        ArrayDeque<Integer> substances = new ArrayDeque<>(); //LIFO
        List<Integer> challenges = new ArrayList<>();

        for (int i = 0; i < lineOne.length; i++) {
            tools.offer(lineOne[i]);
        }

        for (int i = 0; i < lineTwo.length; i++) {
            substances.push(lineTwo[i]);
        }

        for (int i = 0; i < challengesArray.length; i++) {
            challenges.add(challengesArray[i]);
        }

        while (!tools.isEmpty() && !substances.isEmpty() && !challenges.isEmpty()) {

            int combination = tools.peek() * substances.peek();

            boolean match = false;

            for (int i = 0; i < challenges.size(); i++) {
                if (challenges.get(i) == combination) {
                    tools.poll();
                    substances.pop();
                    challenges.remove(i);
                    match = true;
                    break;
                }
            }
            if (!match){
                int singleTool = tools.poll() + 1;
                tools.offer(singleTool);
                int singleSubstance = substances.pop() - 1;
                if (singleSubstance > 0) {
                    substances.push(singleSubstance);
                }
            }
        }
        if (challenges.isEmpty()) {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        } else {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        }

        if (!tools.isEmpty()) {
            List<String> toolsString = new ArrayList<>();
            while (!tools.isEmpty()) {
                toolsString.add(String.valueOf(tools.poll()));
            }
            String output = String.join(", ", toolsString);
            System.out.println("Tools: " + output);
        }

        if (!substances.isEmpty()) {
            List<String> substancesString = new ArrayList<>();
            while (!substances.isEmpty()) {
                substancesString.add(String.valueOf(substances.pop()));
            }
            String output = String.join(", ", substancesString);
            System.out.println("Substances: " + output);
        }

        if (!challenges.isEmpty()) {
            List<String> stringChallenges = new ArrayList<>();
            for (int i = 0; i < challenges.size(); i++) {
                stringChallenges.add(String.valueOf(challenges.get(i)));
            }
            System.out.println("Challenges: " + String.join(", ", stringChallenges));
        }
    }
}
