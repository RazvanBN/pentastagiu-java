import java.util.Scanner;

public class StringAlphabet {
    public static void main(String[] args) {

        displayString();

    }

    // find the letters index and display them
    private static void displayString () {
        String alphabet = "abcdefghijklmnopqrstvxyz";
        Scanner userInput = new Scanner(System.in);
        System.out.print("Insert letters: ");
        String b = userInput.nextLine();
        String c = "";
        for(int i=0; i<b.length(); i++) {
            for(int j=0; j<alphabet.length(); j++) {
                if(b.charAt(i) == alphabet.charAt(j)) {
                    c = c.concat(Integer.toString(j)).concat(" ");
                }
            }
        }
        System.out.print("Index position of the letter: " + c);
    }
}
