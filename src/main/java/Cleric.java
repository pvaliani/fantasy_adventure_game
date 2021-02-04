public class Cleric extends Player {

    private IHeal selectedAlchemy;

    public Cleric(String name, int healthPoints, IHeal selectedAlchemy){
        super(name, healthPoints);
        this.selectedAlchemy = selectedAlchemy;


    }
}
