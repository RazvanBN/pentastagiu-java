import java.util.Scanner;

public class StringDuplicates {
    public static void main(String[] args) {

        displayString();

    }
    // method to create the input text
    private static StringBuilder inputString() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Insert text: ");
        StringBuilder inputText = new StringBuilder(userInput.nextLine());
        return inputText;
    }
    // method to find the duplicates and replace them with #
    private static void displayString () {
        StringBuilder a = inputString();
        for(int i=1; i<a.length(); i++) {
            if(a.charAt(i) == a.charAt(i-1)) {
                a.insert(i, '#');
            }
        }
        System.out.print("Final text: " + a);
    }
}
