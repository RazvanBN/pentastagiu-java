package module1week4.StrategyGame;

public enum Artifacts {
    HEALTH(10),
    ENERGY(5);

    private int extraPoints;
    private int locationX;
    private int locationY;

    Artifacts(int extraPoints) {
        this.extraPoints = extraPoints;
    }

    public void setLocation(int locationX, int locationY) {
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public int getExtraPoints() {
        return extraPoints;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

}
