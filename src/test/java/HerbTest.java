import healings.Herb;
import org.junit.Before;
import org.junit.Test;
import players.Player;

public class HerbTest {

    Herb herb;
    Knight player_1;

    @Before
    public void before() {
        herb = new Herb();
        player_1 = new Knight("Sir Mixalot", 100);
    }


    @Test
    public void canBeHealed(){
        herb.healPlayer(player_1);
        assertEquals(110, player_1.getHealed(););
    }



}
