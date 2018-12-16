package module1week3.shapes;

import java.util.Scanner;

public class UserInput {
    protected static int shapeSelection = 0;
    protected static int shapeNumbers = 0;
    protected static double[] circleRadius;
    protected static double[] squareDimension;
    protected static double[] rectangleLength;
    protected static double[] rectangleWidth;
    protected static double[] triangleBase;
    protected static double[] triangleLeftSide;
    protected static double[] triangleRightSide;

    // Select the type of shape from which you want to create objects
    protected static void shapeSelection() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please select the shape to calculate the area and perimeter or the option to display the results: ");
        System.out.println("1 - Circle");
        System.out.println("2 - Square");
        System.out.println("3 - Rectangle");
        System.out.println("4 - Triangle");
        System.out.println("5 - Show calculations");
        shapeSelection = userInput.nextInt();
    }

    // Select the numbers of objects you want to create
    protected static void shapeNumbers() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many object you want to create ? Note: Maximum is 3!");
        shapeNumbers = userInput.nextInt();
        if(shapeNumbers==0 || shapeNumbers>3) {
            System.out.println("Error: You have selected 0 or more than 3 objects!");
        }
    }

    // Insert the radius for circles
    protected static void insertCircleRadius() {
        Scanner userInput = new Scanner(System.in);
        if(shapeNumbers>=1 && shapeNumbers<=3) {
            circleRadius = new double[shapeNumbers];
            for (int i = 0; i < circleRadius.length; i++) {
                System.out.print("Enter circle " + (i+1) + " radius: ");
                circleRadius[i] = userInput.nextDouble();
            }
            for (int i = 0; i < circleRadius.length; i++) {
                System.out.println("Circle " + (i+1) + " radius entered: " + circleRadius[i]);
            }
        }
        System.out.println(" ");
    }

    // Insert the square dimension (length)
    protected static void insertSquareDimension () {
        Scanner userInput = new Scanner(System.in);
        if(shapeNumbers>=1 && shapeNumbers<=3) {
            squareDimension = new double[shapeNumbers];
            for (int i = 0; i < squareDimension.length; i++) {
                System.out.print("Enter square " + (i+1) + " dimension (length): ");
                squareDimension[i] = userInput.nextDouble();
            }
            for (int i = 0; i < squareDimension.length; i++) {
                System.out.println("Square " + (i+1) + " dimension (length) entered: " + squareDimension[i]);
            }
        }
        System.out.println(" ");
    }

    // Insert the rectangle length and width
    protected static void insertRectangleValues () {
        Scanner userInput = new Scanner(System.in);
        if(shapeNumbers>=1 && shapeNumbers<=3) {
            rectangleLength = new double[shapeNumbers];
            rectangleWidth = new double[shapeNumbers];
            for (int i = 0; i < rectangleWidth.length; i++) {
                System.out.print("Enter rectangle " + (i+1) + " length: ");
                rectangleLength[i] = userInput.nextDouble();
                System.out.print("Enter rectangle " + (i+1) + " width: ");
                rectangleWidth[i] = userInput.nextDouble();
            }
            for (int i = 0; i < rectangleWidth.length; i++) {
                System.out.println("Rectangle " + (i+1) + " length entered " + rectangleLength[i]);
                System.out.print("Rectangle " + (i+1) + " width entered " + rectangleWidth[i]);
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }

    // Insert the triangle sides
    protected static void insertTriangleValues () {
        Scanner userInput = new Scanner(System.in);
        if(shapeNumbers>=1 && shapeNumbers<=3) {
            triangleBase = new double[shapeNumbers];
            triangleLeftSide = new double[shapeNumbers];
            triangleRightSide = new double[shapeNumbers];
            for (int i = 0; i < triangleBase.length; i++) {
                System.out.print("Enter triangle " + (i+1) + " base length: ");
                triangleBase[i] = userInput.nextDouble();
                System.out.print("Enter triangle " + (i+1) + " left side length: ");
                triangleLeftSide[i] = userInput.nextDouble();
                System.out.print("Enter triangle " + (i+1) + " right side length: ");
                triangleRightSide[i] = userInput.nextDouble();
            }
            for (int i = 0; i < triangleBase.length; i++) {
                System.out.println("Triangle " + (i+1) + " base length entered: " + triangleBase[i]);
                System.out.println("Triangle " + (i+1) + " left side length entered: " + triangleLeftSide[i]);
                System.out.print("Triangle " + (i+1) + " right side length entered: " + triangleRightSide[i]);
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }



}
