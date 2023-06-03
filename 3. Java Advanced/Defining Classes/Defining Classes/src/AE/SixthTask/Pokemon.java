package AE.SixthTask;

public class Pokemon {

    private String name;

    private String element;

    private int health;

    // constructors


    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    // getters

    public String getElement() {
        return element;
    }

    public int getHealth() {
        return health;
    }

    // setters


    public void reduceHealth() {
        this.health -= 10;
    }

    // methods

    public boolean isDeath() {
        return this.health <= 0;
    }
}
