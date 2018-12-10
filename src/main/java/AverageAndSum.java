import java.util.Scanner;

public class AverageAndSum {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Calculate the average and sum");
        System.out.println("Enter starting range: ");
        int getRange1 = userInput.nextInt();
        System.out.println("Enter ending range: ");
        int getRange2 = userInput.nextInt();

        // sum numbers
        double result = 0;
        int countNumbers = 0;
        for (int i = getRange1; i <= getRange2; i++) {
            result = result + i;
            countNumbers++;
        }

        // calculate the average
        double average = result/countNumbers;

        System.out.println("The sum is: " + result);
        System.out.println("The average is: " + average);

    }
}