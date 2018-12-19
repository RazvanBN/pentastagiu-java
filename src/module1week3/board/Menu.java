package module1week3.board;

public class Menu {

    public void mainMenu() {
        System.out.println("Welcome. Please select an option from below: ");
        System.out.println("1 - Register new user");
        System.out.println("2 - Show board messages");
    }

    public void userName() {
        System.out.print("Please enter your username: ");
    }

    public void userMail() {
        System.out.print("Please enter your mail: ");
    }

    public void userMessage() {
        System.out.print("Please enter a message: ");
    }

    public void userMessageDescription() {
        System.out.print("Please enter a message description: ");
    }
}