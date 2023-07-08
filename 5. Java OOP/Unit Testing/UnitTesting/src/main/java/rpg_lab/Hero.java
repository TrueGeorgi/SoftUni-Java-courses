package rpg_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hero {

    private String name;
    private int experience;
    private Weapon weapon;

    private List<String> inventory;

    public Hero(String name, Weapon weapon) {
        this.name = name;
        this.experience = 0;
        this.weapon = weapon;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getInventorySize() {
        return inventory.size();
    }

    public boolean inventoryContainsItem (String name) {
        if (inventory.contains(name)) {
            return true;
        } else {
            return false;
        }
    }

    public int getExperience() {
        return this.experience;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void attack(Target target) {
        this.weapon.attack(target);

        if (target.isDead()) {
            this.experience += target.giveExperience();
            inventory.add(target.DROPS_ITEM);
        }
    }
}
