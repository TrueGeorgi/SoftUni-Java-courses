package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class HeroTest {

    private static final int TARGET_EXP = 3;
    private static final String HERO_NAME = "Sir Lancelot";

    private Target targetMock;
    private Weapon weaponMock;
    private Hero hero;

    @Before
    public void initializeObjects() {
        this.targetMock = Mockito.mock(Target.class);
        this.weaponMock = Mockito.mock(Weapon.class);
        this.hero = new Hero(HERO_NAME, weaponMock);
    }

    @Test
    public void attackGainsExperienceIfTargetIsDead() {

        Mockito.when(targetMock.isDead()).thenReturn(true);
        Mockito.when(targetMock.giveExperience()).thenReturn(TARGET_EXP);

        hero.attack(targetMock);

        Assert.assertEquals("Wrong experience", TARGET_EXP, hero.getExperience());
    }

    @Test
    public void deadTargetDropsItem() {

    }
}
