package module1week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxAverage {
    public static void main(String[] args) {

        displayArrays();

    }

    // method to create the array with user input
    private static int[] inputArrayOne() {
        Scanner userInput = new Scanner(System.in);

        // set the array one length
        System.out.print("Enter array length: ");
        int arrayLength = userInput.nextInt();
        int array[] = new int[arrayLength];

        // create the array one with user input
        for(int i=0; i<arrayLength; i++) {
            System.out.print("Enter number " + (i+1) + " : ");
            array[i]=userInput.nextInt();
        }
        return array;
    }
    // method to find the min, max, average and display the array
    private static void displayArrays () {
        int a[] = inputArrayOne();
        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();
        double average = Arrays.stream(a).average().getAsDouble();
        System.out.print("The array you entered is: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}
