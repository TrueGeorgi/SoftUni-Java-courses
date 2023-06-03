package AE.SixthTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {

    private String name;

    private int numberOfBadges;

    private List<Pokemon> pokemonsOwned;

    // constructors


    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemonsOwned = new ArrayList<>();
    }

    // getters

    public List<Pokemon> getPokemonsOwned() {
        return pokemonsOwned;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    // setters

    public void addBadge() {
        this.numberOfBadges += 1;
    }


    // methods

    public void clearDeathPokemons() {
        pokemonsOwned.removeIf(Pokemon::isDeath);
    }

    public boolean hasPokemonWithElement (String element) {
      return pokemonsOwned.stream().map(Pokemon::getElement).collect(Collectors.toList()).contains(element);
    }

    public void reducePokemonsHealth () {
        pokemonsOwned.forEach(Pokemon::reduceHealth);
    }

    public void addPokemonsOwned(Pokemon pokemon) {
        this.pokemonsOwned.add(pokemon);
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", name, numberOfBadges, pokemonsOwned.size());
    }
}
