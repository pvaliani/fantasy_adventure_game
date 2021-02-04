package healings;

import players.Player;

public class Herb implements IHeal {

    private int healingValue;

    public Herb(){
        this.healingValue = 10;
    }

//    set the healing points for the player by the pre-defined healing value of a herb i.e 10

    public void healPlayer(Player player){
        player.getHealed(this.healingValue);
    }

}
