package players;

import enemies.Enemy;
import players.Player;

public abstract class Fighter extends Player {

//    we don't implement players.IWeapon  - we create a type of players.IWeapon called selected Weapon
    private IWeapon selectedWeapon;

    public Fighter(String name, int healthPoints, IWeapon selectedWeapon){
        super(name, healthPoints);
        this.selectedWeapon =  selectedWeapon;

    }

//    getters and setters for selectedWeapon

    public IWeapon getSelectedWeapon() {
        return selectedWeapon;
    }

    public void setSelectedWeapon(IWeapon selectedWeapon) {
        this.selectedWeapon = selectedWeapon;
    }

    public void attack(Enemy enemy){

    }

//    swap weapon invokes the setter for selected weapon and takes in the new weapon to do a swap

    public void swapWeapon(IWeapon selectedWeapon){
        setSelectedWeapon(selectedWeapon);
    }




}
