public class Mage extends Player implements IDefend, ISpell {


    public Mage(String selectedPlayer, String name, int healthPoints, IDefend defend, ISpell spell){
        super(selectedPlayer, name, healthPoints);

    }

    public void getSpell(IDefend defend){
        this.defend = defend;
    }
    public void getSpell(ISPell spell){
        this.spell = spell;
    }
}
