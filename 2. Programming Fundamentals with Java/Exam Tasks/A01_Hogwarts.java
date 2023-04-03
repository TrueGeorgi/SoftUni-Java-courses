import java.util.Scanner;

public class A01_Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String spellRaw = scanner.nextLine();
        StringBuilder spell = new StringBuilder(spellRaw);

        String input = scanner.nextLine();
        while (!input.equals("Abracadabra")) {
            String action = input.split("\\s+")[0];
            switch (action) {
                case "Abjuration":
                    spellRaw = spellRaw.toUpperCase();
                    spell = new StringBuilder(spellRaw);
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spellRaw = spellRaw.toLowerCase();
                    spell = new StringBuilder(spellRaw);
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(input.split("\\s+")[1]);
                    if (index >= spell.length()) {
                        System.out.println("The spell was too weak.");
                        input = scanner.nextLine();
                        continue;
                    }
                    String letter = input.split("\\s+")[2];
                    spell.delete(index, index + 1);
                    spell.insert(index, letter);
                    spellRaw = String.valueOf(spell);
                    System.out.println("Done!");
                    break;
                case "Divination":
                    String firstSubstring = input.split("\\s+")[1];
                    String secondSubstring = input.split("\\s+")[2];
                    if (spellRaw.contains(firstSubstring)) {
                        spellRaw = spellRaw.replace(firstSubstring, secondSubstring);
                        spell = new StringBuilder(spellRaw);
                        System.out.println(spellRaw);
                    }
                    break;
                case "Alteration":
                    String substring = input.split("\\s+")[1];
                    if (spellRaw.contains(substring)) {
                        spellRaw = spellRaw.replace(substring, "");
                        spell = new StringBuilder(spellRaw);
                        System.out.println(spellRaw);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
            }


            input = scanner.nextLine();
        }
    }
}
