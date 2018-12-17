package module1week3;

import module1week3.shop.*;

import java.util.Scanner;

public class ShopAppMain extends ConsoleMenu {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int mainMenu;
        int bookMenu;
        int candiesMenu;
        boolean calculateTotal = false;
        int membershipStatus;

        Book javaBook = new Book(1, 50, "Java Programming", "Georgiana, Alex");
        Book gitBook = new Book(2, 45, "Intro to Git", "Bogdan");
        Candy mars = new Candy(3, 3.2, "Mars", 2);
        Candy iceCream = new Candy(4, 5.7, "Vanilla IceCream", 3);
        Candy milka = new Candy(5, 4.5, "Milka", 3);

        Customer clientOne = Customer.NO;
        clientOne.setName("Razvan");
        clientOne.setId(1);

        Basket client1Basket = new Basket(0);

        // console application inside a while loop so you can keep navigate trough the menu;
        // it exits the while loop when you select the option to calculate the total price to pay
        while(!calculateTotal) {
            mainMenu();
            mainMenu = userInput.nextInt();
            // books menu
            if (mainMenu == 1) {
                // display the two books objects created at the beginning
                bookMenu(javaBook.getName(), javaBook.getAuthor(), javaBook.getPrice(),
                        gitBook.getName(), gitBook.getAuthor(), gitBook.getPrice());
                bookMenu = userInput.nextInt();
                // selection of books to add to the basked and update the total price
                if (bookMenu == 1) {
                    client1Basket.addProduct(javaBook.getPrice(), 1);
                } else if (bookMenu == 2) {
                    client1Basket.addProduct(gitBook.getPrice(), 1);
                }
                // candies menu
            } else if (mainMenu == 2) {
                // display the three candies objects created at the beginning
                candiesMenu(mars.getName(), mars.getPrice(), iceCream.getName(), iceCream.getPrice(),
                        milka.getName(), milka.getPrice());
                candiesMenu = userInput.nextInt();
                // selection of candies to add to the basket and update the total price
                if (candiesMenu == 1) {
                    client1Basket.addProduct(mars.getPrice(), mars.getQuantity());
                } else if (candiesMenu == 2) {
                    client1Basket.addProduct(iceCream.getPrice(), iceCream.getQuantity());
                } else if (candiesMenu == 3) {
                    client1Basket.addProduct(milka.getPrice(), milka.getQuantity());
                }
                // display selection of membership and calculate the total price based on it
                // also set the "calculateTotal" to true to exit the while loop (main menu)
            } else if(mainMenu == 3) {
                calculateTotal = true;
                selectMembershipStatus();
                membershipStatus = userInput.nextInt();
                switch (membershipStatus) {
                    case 1: {
                        clientOne = Customer.NO;
                        break;
                    }
                    case 2: {
                        clientOne = Customer.SILVER;
                        break;
                    }
                    case 3: {
                        clientOne = Customer.GOLD;
                        break;
                    }
                    default: {
                        System.out.println("Invalid selection, will select NO membership status automatically");
                        clientOne = Customer.NO;
                        break;
                    }
                }
                // calculate the total price based on membership status selection
                client1Basket.getTotalPrice(clientOne);
            }
            System.out.println("Invalid selection");
        }
    }
}
