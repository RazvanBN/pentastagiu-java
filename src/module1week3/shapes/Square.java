package module1week3.shapes;

public class Square {
    private double squareDimension;
    private double squareArea;
    private double squarePerimeter;

    public Square(double squareDimension) {
        this.squareDimension = squareDimension;
    }

    public double calculateSquareArea() {
        squareArea = squareDimension*squareDimension;
        return squareArea;
    }

    public double calculateSquarePerimeter() {
        squarePerimeter = 4*squareDimension;
        return squarePerimeter;
    }
}
