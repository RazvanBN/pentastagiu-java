package module1week4.restaurant;

import static java.lang.StrictMath.round;

public class FastFood extends Restaurant implements CalculateIncomeAndTaxes {
    private final double firstMenuPrice = 25;

    public FastFood(String name, int guests) {
        super(name, guests);
    }

    @Override
    public double calculateIncome() {
        return guests * firstMenuPrice;
    }

    @Override
    public double calculateTaxes() {
        return round(calculateIncome()*(20/100.0f));
    }
}
