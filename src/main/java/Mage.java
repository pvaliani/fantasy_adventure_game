public class Mage extends Player{

//    the mage creates instances of IDefend and ISpell type in order to invoke defends/spells on an enemy

    private IDefend defend;
    private ISpell castSpell;

    public Mage(String name, int healthPoints, IDefend defend, ISpell castSpell){
        super(name, healthPoints);
        this.castSpell = castSpell;
        this.defend = defend;
    }

    public void getcastSpell(){
        this.castSpell = castSpell;
    }

    public void getDefend(){
        this.defend = defend;
    }

    public void

}
