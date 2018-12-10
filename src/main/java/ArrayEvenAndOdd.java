import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenAndOdd {
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
    // method to display the array & how many even and odd numbers exist in the array
    private static void displayArrays () {
        int a[] = inputArrayOne();
        int even = 0;
        int odd = 0;
        System.out.print("The array you entered is: ");
        System.out.println(Arrays.toString(a));
        for(int i=0; i<a.length; i++) {
            if(a[i]%2!=0) {
                odd++;
            } else {
                even++;
            }
        }
        System.out.println("Odd elements count: " + odd);
        System.out.println("Even elements count: " + even);
    }
}
