package AE.SixthTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!command.equals("Tournament")) {

            String trainerName = command.split("\\s+")[0];
            String pokemonName = command.split("\\s+")[1];
            String pokemonElement = command.split("\\s+")[2];
            int pokemonHealth = Integer.parseInt(command.split("\\s+")[3]);

            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, new Trainer(trainerName));
            }

            trainers.get(trainerName).addPokemonsOwned(new Pokemon(pokemonName, pokemonElement, pokemonHealth));

            command = scanner.nextLine();
        }

        command = scanner.nextLine();

        while (!command.equals("End")) {

            switch (command) {
                case "Fire":
                    modifyTrainerByPokemonElement(trainers, "Fire");
                    break;
                case "Water":
                    modifyTrainerByPokemonElement(trainers, "Water");
                    break;
                case "Electricity":
                    modifyTrainerByPokemonElement(trainers, "Electricity");
                    break;
            }

            command = scanner.nextLine();
        }

        trainers
                .values()
                .stream()
                .sorted((t1, t2) -> Integer.compare(t2.getNumberOfBadges(), t1.getNumberOfBadges()))
                .forEach(System.out::println);
    }

    private static void modifyTrainerByPokemonElement(Map<String, Trainer> trainers, String element) {
        trainers.forEach((name, trainer) -> {
            if (trainer.hasPokemonWithElement(element)) {
                trainer.addBadge();
            } else {
                trainer.reducePokemonsHealth();
                trainer.clearDeathPokemons();
            }
        });
    }
}
