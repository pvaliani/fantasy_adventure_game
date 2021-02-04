public abstract class Player {

    private String selectedPlayer;
    private String name;
    private int healthPoints;

//    player constructor class - takes in a name, player selection i.e barbarian and healthPoints

    public Player(String selectedPlayer, String name, int healthPoints){

       this.selectedPlayer =  selectedPlayer;
       this.name =  name;
       this.healthPoints = healthPoints;
    }

//    getters and setters for selectedPlayer

    public String getSelectedPlayer() {
        return selectedPlayer;
    }

    public void setSelectedPlayer(String selectedPlayer) {
        this.selectedPlayer = selectedPlayer;
    }

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
