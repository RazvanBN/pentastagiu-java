import java.util.Scanner;

public class StringPalindrome {
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
    // method to test if the given string is palindrome
    private static void displayString () {
        String a = inputString();
        System.out.println(a.equals(new StringBuilder(a).reverse().toString()));
    }
}
