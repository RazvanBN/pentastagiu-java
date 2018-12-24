package module1week4;

import module1week4.restaurant.FastFood;
import module1week4.restaurant.Restaurant;
import module1week4.restaurant.Vegan;

import java.util.Scanner;

public class RestaurantAppMain {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int loopMenu = 1;

        Restaurant fastFood = new FastFood("Burgers", 40);
        Restaurant vegan = new Vegan("OnlyHealth", 40);

        System.out.println("Welcome. Please select an option from below!");

        while (loopMenu==1) {
            System.out.println("1 - Add new guest to FastFood Restaurant");
            System.out.println("2 - Add new guest to Vegan Restaurant");
            System.out.println("3 - Show incomes and taxes for both restaurants");
            System.out.println("4 - Exit application");

            switch (userInput.nextInt()) {
                case 1:
                    fastFood.addNewGuest();
                    break;
                case 2:
                    vegan.addNewGuest();
                    break;
                case 3:
                    System.out.println("FastFood Restaurant[" + "Guests: " + fastFood.getGuests() + ',' +
                            "Income: " + ((FastFood) fastFood).calculateIncome() + ',' +
                            "Taxes to pay: " + ((FastFood) fastFood).calculateTaxes() + ']');
                    System.out.println("Vegan Restaurant[" + "Guests: " + vegan.getGuests() + ',' +
                            "Income: " + ((Vegan) vegan).calculateIncome() + ',' +
                            "Taxes to pay: " + ((Vegan) vegan).calculateTaxes() + ']');
                    break;
                case 4:
                    loopMenu = 0;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        }

    }
}