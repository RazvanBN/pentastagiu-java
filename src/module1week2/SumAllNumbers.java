package module1week2;

import java.util.Scanner;
public class SumAllNumbers {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the target number to which the sum will be made");
        int getUserInput = userInput.nextInt();

        int result = 0;
        for(int i=0; i<=getUserInput; i++) {
            result = result +i;
        }

        System.out.println("The sum is: " + result);

    }
}
