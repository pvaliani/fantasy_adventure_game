package players;

import enemies.Enemy;

// the weapon interface requires an enemy to invoke the attack by the selected player
public interface IWeapon {
    public void attack(Enemy enemy);
}
