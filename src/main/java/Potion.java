public class Potion implements IHeal {

    private int healingValue;


    public Potion(int healingValue){

        this.healingValue = 20;
    }

    public void healPlayer(Player player){
        player.setHealthPoints(this.healingValue);

    }
}
