public abstract class Player {

    private String name;
    private int healthPoints;

//    player constructor class - takes in a name, player selection i.e barbarian and healthPoints

    public Player(String name, int healthPoints){

       this.name =  name;
       this.healthPoints = healthPoints;
    }

//    getters and setters for selectedPlayer


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }



}
