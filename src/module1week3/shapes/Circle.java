package module1week3.shapes;

public class Circle {
    private double circleRadius;
    private double circleArea;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }


    public double calculateCircleArea () {
        circleArea = Math.PI * (circleRadius * circleRadius);
        return  circleArea;
    }

}
