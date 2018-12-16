package module1week2;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoArrays {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // set the array one length
        System.out.println("Enter array one length");
        int arrayOneLength = userInput.nextInt();
        int arrayOne[] = new int[arrayOneLength];

        // create the array one with user input
        for(int i=0; i<arrayOneLength; i++) {
            System.out.println("Enter number " + (i+1) + " :");
            arrayOne[i]=userInput.nextInt();
        }
        // set the array two length
        System.out.println("Enter array two length");
        int arrayTwoLength = userInput.nextInt();
        int arrayTwo[] = new int[arrayTwoLength];

        // create the array two with user input
        for(int i=0; i<arrayTwoLength; i++) {
            System.out.println("Enter number " + (i+1) + " :");
            arrayTwo[i]=userInput.nextInt();
        }

        // display the arrays
        System.out.println("The first array you entered is: ");
        for(int i=0; i<arrayOneLength; i++) {
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println(" ");
        System.out.println("The second array you entered is: ");
        for(int i=0; i<arrayTwoLength; i++) {
            System.out.print(arrayTwo[i] + " ");
        }
        System.out.println(" ");
        // test first and last element
        if(Arrays.equals(arrayOne, arrayTwo)){
            System.out.println("Both arrays are equal");
        } else {
            System.out.println("The arrays are not equal");
        }
    }

}
