package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DummyTest {

    private static final int DUMMY_HEALTH = 1;
    private static final int DUMMY_EXP = 3;
    private static final int ATTACK_TAKEN = 1;
    private static final int EXPECTED_HEALTH = DUMMY_HEALTH - 1;

    private Dummy dummy;

    @Before
    public void initializeObjects () {
        this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_EXP);
    }


    @Test
    public void dummyLosesHealthWhenAttacked () {
        this.dummy.takeAttack(ATTACK_TAKEN);

        Assert.assertEquals(EXPECTED_HEALTH, this.dummy.getHealth());
    }

    @Test (expected = IllegalStateException.class)
    public void cannotAttackDeadDummy () {
        this.dummy.takeAttack(ATTACK_TAKEN);
        this.dummy.takeAttack(ATTACK_TAKEN);
    }

    @Test
    public void deadDummyGivesExp () {
        this.dummy.takeAttack(ATTACK_TAKEN);
        this.dummy.giveExperience();
    }

    @Test (expected = IllegalStateException.class)
    public void aliveDummyDoesNotGivesExp () {
        this.dummy.giveExperience();
    }
}
