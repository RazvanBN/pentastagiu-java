package module1week3;

import module1week3.board.Functionality;
import module1week3.board.Menu;

import java.util.Scanner;

public class BoardAppMain {

    public static void main(String[] args) {
        int loopMenu = 1;
        int menuOption;
        String userName;
        String userMail;
        String userMessage;
        String userMessageDescription;

        Scanner userInput = new Scanner(System.in);

        Menu menu = new Menu(); // menu console
        Functionality app = new Functionality(); // features like adding a new username, posting a message and message description and show all users posts with their contact info

        while (loopMenu == 1) { // a loop to stay in the console main menu, create new users and post messages until you decide to show all posted messages
            menu.mainMenu();
            menuOption = userInput.nextInt();
            userInput.nextLine();
            if(menuOption == 1) {                                               // register new user option
                menu.userName();                                                // system print out
                userName = userInput.nextLine();                                // save user input
                menu.userMail();                                                // system print out
                userMail = userInput.nextLine();                                // save user input
                app.addUser(userName, userMail);                                // add user with the name and mail from user input
                menu.userMessage();                                             // system print out
                userMessage = userInput.nextLine();                             // save user message input
                menu.userMessageDescription();                                  // system print out
                userMessageDescription = userInput.nextLine();                  // save user message description input
                app.postMessage(userMessage, userMessageDescription);           // add the message and description from user input
            }
            if(menuOption == 2) {                                               // show all user messages option
                app.showBoard();                                                // loop trough all messages
                loopMenu += 1;                                                  // exit while
            }
            System.out.println("Invalid selection, please make a selection from the listed menu");
        }
    }
}
