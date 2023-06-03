package AE.SeventhTask;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;

    private Company company;

    private Car car;

    private List<Parent> parents;

    private List<Child> children;

    private List<Pokemon> pokemons;

    public Person(String name) {
        this.name = name;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void addParent(Parent parent) {
        parents.add(parent);
    }

    public void addChild(Child child) {
        children.add(child);
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(name).append("\n").append("Company:").append("\n");

        if (company != null) {
            builder.append(company.toString()).append("\n");
        }

        builder.append("Car:").append("\n");

        if (car != null) {
            builder.append(car.toString()).append("\n");
        }

        builder.append("Pokemon:").append("\n");

        if (!pokemons.isEmpty()) {
            for (Pokemon pokemon : pokemons) {
                builder.append(pokemon.toString()).append("\n");
            }
        }

        builder.append("Parents:").append("\n");

        if (!parents.isEmpty()) {
            for (Parent parent : parents) {
                builder.append(parent.toString()).append("\n");
            }
        }

        builder.append("Children:").append("\n");

        if (!children.isEmpty()) {
            for (Child child : children) {
                builder.append(child.toString()).append("\n");
            }
        }

        return builder.toString();
    }
}
