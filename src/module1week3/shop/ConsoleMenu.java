package module1week3.shop;

//import java.util.Scanner;

public class ConsoleMenu {

    // display the main menu in console
    protected static void mainMenu() {
        System.out.println("Select product category:");
        System.out.println("1 - Books");
        System.out.println("2 - Candies");
        System.out.println("3 - Total price");
    }

    // display the books menu in console with books name, author and price
    protected static void bookMenu(String book1Name, String book1Author, double book1Price,
                         String book2Name, String book2Author, double book2Price) {
        System.out.println("Choose a book: ");
        System.out.println("1 - " + book1Name + " written by " + book1Author + ". " + "Price: " + book1Price);
        System.out.println("2 - " + book2Name + " written by " + book2Author + ". " + "Price: " + book2Price);
    }

    // display the candies menu in console with candies name and price
    protected static void candiesMenu(String candy1Name, double candy1Price, String candy2Name, double candy2Price,
                            String candy3Name, double candy3Price) {
        System.out.println("Choose a candy: ");
        System.out.println("1 - " + candy1Name + ". " + "Price: " + candy1Price);
        System.out.println("2 - " + candy2Name + ". " + "Price: " + candy2Price);
        System.out.println("3 - " + candy3Name + ". " + "Price: " + candy3Price);
    }

    // display a selection of membership status
    protected static void selectMembershipStatus() {
        System.out.println("Select membership status: ");
        System.out.println("1 - No membership");
        System.out.println("2 - Silver membership");
        System.out.println("3 - Gold membership");
    }

}
