package module1week3.shapes;

public class Rectangle {
    private double rectangleLength;
    private double rectangleWidth;
    private double rectangleArea;
    private double rectanglePerimeter;

    public Rectangle(double rectangleLength, double rectangleWidth) {
        this.rectangleLength = rectangleLength;
        this.rectangleWidth = rectangleWidth;
    }

    public double calculateRectangleArea () {
        rectangleArea = rectangleLength * rectangleWidth;
        return rectangleArea;
    }

    public double calculateRectanglePerimeter () {
        rectanglePerimeter = 2*(rectangleLength+rectangleWidth);
        return rectanglePerimeter;
    }
}
