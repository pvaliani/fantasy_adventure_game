import healings.Herb;
import org.junit.Before;
import org.junit.Test;
import players.Knight;
import players.Player;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class HerbTest {

    Herb herb;
    Knight player_1;
    Sword battleSword;

    @Before
    public void before() {
        herb = new Herb();
        battleSword = new Sword();
        player_1 = new Knight("Sir Mixalot", 100, Sword, 100);
    }


    @Test
    public void canBeHealed(){
        herb.healPlayer(player_1);
        assertEquals(110, player_1.getHealthPoints());
    }



}
