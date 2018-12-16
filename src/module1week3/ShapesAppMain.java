package module1week3;

import module1week3.shapes.*;

public class ShapesAppMain extends UserInput {
    // Note: Sorry for the long code & I haven't implemented a logic to test if the circle/square values are not 0
    // and neither if the triangle/rectangle values are valid to create a true triangle/rectangle

    // Create null objects for every shape type
    private static Circle[] circleObject = null;
    private static Square[] squareObject = null;
    private static Rectangle[] rectangleObject = null;
    private static Triangle[] triangleObject = null;

    public static void main(String[] args) {
        displayCalculations();
    }

    private static void createObject() {
        shapeSelection();
        // Test if user has done inputting data and create objects depending on the user selection
        while (shapeSelection != 5) {
            // Create circle objects depending on the selected "shapeNumbers"
            if (shapeSelection == 1) {
                if (circleObject != null) {
                    System.out.println("You have already made circle objects");
                } else {
                    shapeNumbers();
                    insertCircleRadius();
                    circleObject = new Circle[shapeNumbers];
                    for (int i = 0; i < circleObject.length; i++) {
                        circleObject[i] = new Circle(circleRadius[i]);
                    }
                }
            }
            // Create square objects depending on the selected "shapeNumbers"
            if (shapeSelection == 2) {
                if (squareObject != null) {
                    System.out.println("You have already made square objects");
                } else {
                    shapeNumbers();
                    insertSquareDimension();
                    squareObject = new Square[shapeNumbers];
                    for (int i = 0; i < squareObject.length; i++) {
                        squareObject[i] = new Square(squareDimension[i]);
                    }
                }

            }
            // Create rectangle objects depending on the selected "shapeNumbers"
            if (shapeSelection == 3) {
                if (rectangleObject != null) {
                    System.out.println("You have already made rectangle objects");
                } else {
                    shapeNumbers();
                    insertRectangleValues();
                    rectangleObject = new Rectangle[shapeNumbers];
                    for (int i = 0; i < rectangleObject.length; i++) {
                        rectangleObject[i] = new Rectangle(rectangleLength[i], rectangleWidth[i]);
                    }
                }
            }
            // Create triangle objects depending on the selected "shapeNumbers"
            if (shapeSelection == 4) {
                if(triangleObject != null) {
                    System.out.println("You have already made triangle objects");
                } else {
                    shapeNumbers();
                    insertTriangleValues();
                    triangleObject = new Triangle[shapeNumbers];
                    for (int i = 0; i < triangleObject.length; i++) {
                        triangleObject[i] = new Triangle(triangleBase[i], triangleLeftSide[i], triangleRightSide[i]);
                    }
                }
            }


            shapeSelection();
        }
    }

    private static void displayCalculations() {
        createObject();
        if (shapeSelection == 5) {
            if (circleObject != null) {
                for (int i = 0; i < circleObject.length; i++) {
                    System.out.print("Circle " + (i + 1) + " area is: " + String.format("%.2f", circleObject[i].calculateCircleArea()));
                    System.out.println(" ");
                }
            }
            if (squareObject != null) {
                for (int i = 0; i < squareObject.length; i++) {
                    System.out.println(" ");
                    System.out.println("Square " + (i + 1) + " area is: " + String.format("%.2f", squareObject[i].calculateSquareArea()));
                    System.out.print("Square " + (i + 1) + " perimeter is: " + String.format("%.2f", squareObject[i].calculateSquarePerimeter()));
                    System.out.println(" ");
                }
            }
            if (rectangleObject != null) {
                for (int i = 0; i < rectangleObject.length; i++) {
                    System.out.println(" ");
                    System.out.println("Rectangle " + (i + 1) + " area is: " + String.format("%.2f", rectangleObject[i].calculateRectangleArea()));
                    System.out.print("Rectangle " + (i + 1) + " perimeter is: " + String.format("%.2f", rectangleObject[i].calculateRectanglePerimeter()));
                    System.out.println(" ");
                }
            }
            if (triangleObject != null) {
                System.out.println(" ");
                for (int i = 0; i < triangleObject.length; i++) {
                    System.out.println("Triangle " + (i + 1) + " area is: " + String.format("%.2f", triangleObject[i].calculateTriangleArea()));
                    System.out.print("Square " + (i + 1) + " perimeter is: " + String.format("%.2f", triangleObject[i].calculateTrianglePerimeter()));
                    System.out.println(" ");
                }
            }
            if (circleObject == null && squareObject == null && rectangleObject == null && triangleObject == null) {
                System.out.println("Nothing to calculate");
            }
        }
    }
}
