import java.util.Arrays;
import java.util.Scanner;

public class ArrayReturnIndex {
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
    // method to find the index of an input number and display the array
    private static void displayArrays () {
        int a[] = inputArrayOne();
        System.out.print("The array you entered is: ");
        System.out.println(Arrays.toString(a));
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number from the array: ");
        int targetNumber = userInput.nextInt();
        for (int i=0; i<a.length; i++) {
            if(a[i] == targetNumber) {
                System.out.println("Number at index: " + i);
            }
        }

    }
}
