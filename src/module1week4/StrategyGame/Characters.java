package module1week4.StrategyGame;

public class Characters {
    private String name;
    protected int healthPoints;
    protected int energyPoints;
    protected int locationX;
    protected int locationY;

    public Characters(String name, int healthPoints, int energyPoints, int locationX, int locationY) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public Characters(String name, int healthPoints, int locationX, int locationY) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public String getName() {
        return name;
    }


    public String getLocation() {
        return "Location{" + "x=" + locationX + ',' + " y=" + locationY + '}';
    }

    public void displayInfo() {
        System.out.println(name + "[" + "Health:" + healthPoints + ',' + "Energy:" + energyPoints +
                ',' + getLocation() + ']');
    }

    public void receivedArtifact (Artifacts o) {
        switch (o) {
            case HEALTH:
                healthPoints += o.getExtraPoints();
                System.out.println(name + " found a " + o + " artifact and got extra " + o.getExtraPoints() + " health points");
                break;
            case ENERGY:
                energyPoints += o.getExtraPoints();
                System.out.println(name + " found a " + o + " artifact and got extra " + o.getExtraPoints() + " energy points");
                break;
        }
    }

}
