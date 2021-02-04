package weapons;

import enemies.Enemy;
import players.IWeapon;
import players.Player;


public class Club implements IWeapon {

    private int damageValue;

//    deal 20 damage i.e negative health points when there is an attack on

    public Club(int damageValue){
        this.damageValue = -20;
    }

//    attack method from IWeapon interface

        public void attack(Enemy enemy){

            enemy.setHealthPoints(this.damageValue);

    }


}
