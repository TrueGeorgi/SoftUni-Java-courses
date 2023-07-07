package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTest {

    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 1;
    private static final int DUMMY_HEALTH = 15;
    private static final int DUMMY_XP = 9;
    private static final int EXPECTED_DURABILITY = AXE_DURABILITY - 1;

    private Axe axe;
    private Dummy dummy;

    @Before
    public void initializeObjects () {
        this.axe = new Axe(AXE_ATTACK, AXE_DURABILITY);
        this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
    }

    @Test
    public void weaponAttacksLooseDurability() {
        this.axe.attack(dummy);

        Assert.assertEquals(EXPECTED_DURABILITY, this.axe.getDurabilityPoints());
    }

    @Test (expected = IllegalStateException.class)
    public void brokenWeaponCannotAttack()  {

        this.axe.attack(dummy);

        this.axe.attack(dummy);
    }
}