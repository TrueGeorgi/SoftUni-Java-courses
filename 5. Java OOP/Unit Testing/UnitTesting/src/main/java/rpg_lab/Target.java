package rpg_lab;

public interface Target {

    String DROPS_ITEM = "Sword";

    void takeAttack (int attackPoints);
    int getHealth();
    int giveExperience();
    boolean isDead();
}
