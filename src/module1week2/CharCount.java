package module1week2;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {

        displayString();

    }
    // method to create the input text
    private static String inputString() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Insert text: ");
        String inputText = userInput.nextLine();
        return inputText;
    }
    // method to count how many times a character appears in the given string
    private static void displayString () {
        Scanner userInput = new Scanner(System.in);
        String a = inputString();
        System.out.print("Insert character to count: ");
        String b = userInput.nextLine();
        int count = a.length() - a.replace(b, "").length();
        System.out.println("Appearances of letter " + b + " is: " + count);
    }
}
