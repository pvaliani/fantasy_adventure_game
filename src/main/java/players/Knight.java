package players;

public class Knight extends Fighter {

    private int armour;

    public Knight(String name, int healthPoints, IWeapon selectedWeapon, int armour){
        super(name, healthPoints, selectedWeapon);
        this.armour = armour;
    }
    
}
