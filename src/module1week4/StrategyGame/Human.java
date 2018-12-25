package module1week4.StrategyGame;

public class Human extends Characters implements Attacking{

    private static final int attackDamage = 10;
    private static final int attackEnergyUse = 5;

    public Human(String name, int healthPoints, int energyPoints, int locationX, int locationY) {
        super(name, healthPoints, energyPoints, locationX, locationY);
    }


    @Override
    public void attack(Characters o) {
        if(energyPoints >= attackEnergyUse) {
            if (Math.abs(o.locationX - locationX) <= 5 && Math.abs(o.locationY - locationY) <= 5) {
                if (o.healthPoints != 0) {
                    o.healthPoints -= attackDamage;
                    energyPoints -= attackEnergyUse;
                    System.out.println(getName() + " attacked " + o.getName() + " and dealt " + attackDamage + " damage!");
                } else {
                    System.out.println(o.getName() + " is already dead!");
                }
            } else {
                System.out.println("Distance too far!");
            }
        } else {
            System.out.println("Not enough energy!");
        }
    }
}
