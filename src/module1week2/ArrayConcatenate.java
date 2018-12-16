package module1week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcatenate {

    public static void main(String[] args) {

        displayArrays();

    }

    // method to create the first array with user input
    private static int[] inputArrayOne() {
        Scanner userInput = new Scanner(System.in);

        // set the array one length
        System.out.print("Enter array one length: ");
        int arrayOneLength = userInput.nextInt();
        int arrayOne[] = new int[arrayOneLength];

        // create the array one with user input
        for(int i=0; i<arrayOneLength; i++) {
            System.out.print("Enter number " + (i+1) + " : ");
            arrayOne[i]=userInput.nextInt();
        }
        return arrayOne;
    }

    // method to return the second array with user input
    private static int[] inputArrayTwo() {
        Scanner userInput = new Scanner(System.in);

        // set the array two length
        System.out.print("Enter array two length: ");
        int arrayTwoLength = userInput.nextInt();
        int arrayTwo[] = new int[arrayTwoLength];

        // create the array two with user input
        for(int i=0; i<arrayTwoLength; i++) {
            System.out.print("Enter number " + (i+1) + " : ");
            arrayTwo[i]=userInput.nextInt();
        }
        return arrayTwo;
    }

    // method to concatenate and display the arrays
    private static void displayArrays () {
        int a[] = inputArrayOne();
        int b[] = inputArrayTwo();
        System.out.print("The first array you entered is: ");
        System.out.println(Arrays.toString(a));
        System.out.print("The second array you entered is: ");
        System.out.println(Arrays.toString(b));
        int concatenate[] = new int[a.length+b.length];
        System.arraycopy(a, 0, concatenate, 0, a.length);
        System.arraycopy(b, 0, concatenate, a.length, b.length);
        System.out.print("Concatenated array: ");
        System.out.println(Arrays.toString(concatenate));
    }

}
