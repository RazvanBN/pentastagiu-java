package module1week4.restaurant;

import static java.lang.StrictMath.round;

public class Vegan extends Restaurant implements CalculateIncomeAndTaxes{
    private final double firstMenuPrice = 25;

    public Vegan(String name, int guests) {
        super(name, guests);
    }

    @Override
    public double calculateIncome() {
        return guests * firstMenuPrice;
    }

    @Override
    public double calculateTaxes() {
        return round(calculateIncome()*(20/100.0f)-((calculateIncome()*(20/100.0f))*(30/100.0f)));
    }
}
