package module1week3.shapes;

public class Triangle {
    private double triangleBase;
    private double triangleLeftSide;
    private double triangleRightSide;
    private double triangleArea;
    private double trianglePerimeter;

    public Triangle(double triangleBase, double triangleLeftSide, double triangleRightSide) {
        this.triangleBase = triangleBase;
        this.triangleLeftSide = triangleLeftSide;
        this.triangleRightSide = triangleRightSide;
    }

    public double calculateTriangleArea() {
        double h = (triangleBase + triangleLeftSide + triangleRightSide)/2;
        triangleArea = Math.sqrt(h*(h - triangleBase)*(h - triangleLeftSide)*(h - triangleRightSide));
        return triangleArea;
    }

    public double calculateTrianglePerimeter() {
        trianglePerimeter = triangleBase + triangleLeftSide + triangleRightSide;
        return trianglePerimeter;
    }
}
