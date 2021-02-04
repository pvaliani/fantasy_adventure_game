public class Mage extends Player{

//    the mage creates instances of IDefend and ISpell type in order to invoke defends/spells on an enemy

    private IDefend defend;
    private ISpell castSpell;

    public Mage(String name, int healthPoints, IDefend defend, ISpell castSpell){
        super(name, healthPoints);

    }

}
