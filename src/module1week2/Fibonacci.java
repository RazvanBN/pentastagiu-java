package module1week2;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to display from the module1week2.Fibonacci sequence");
        int getUserInput = userInput.nextInt();

        // display and sum all numbers
        // the sequence starts from 0, not from 1
        int f1 = 0;
        int f2 = 1;
        int sum = 0;
        double sumAll = 0;

        System.out.println("The first " + getUserInput + " numbers are:");
        for (int i = 1; i <= getUserInput; i++) {
            System.out.print(f1 + " ");
            sumAll = sumAll + f1;
            sum=f1+f2;
            f1=f2;
            f2=sum;

        }

        // calculate the average
        double average = sumAll/getUserInput;
        System.out.println("");
        System.out.println("The average is: " + average);

    }
}
