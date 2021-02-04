public class Mage extends Player {

    private IDefend defend;
    private ISpell spell;

    public Mage(String selectedPlayer, String name, int healthValue, IDefend defend, ISpell spell ){
        super(selectedPlayer, name, healthValue);
        this.defend = defend;
        this.spell = spell;
    }
}
