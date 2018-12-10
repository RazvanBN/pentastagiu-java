import java.util.Scanner;

public class StringContainsString {
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
    // method to test if the given string contains another given string
    private static void displayString () {
        Scanner userInput = new Scanner(System.in);
        String a = inputString();
        System.out.print("Insert string to test: ");
        String b = userInput.nextLine();
        System.out.println(a.contains(b));
    }
}
