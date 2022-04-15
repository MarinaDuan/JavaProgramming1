package NUIGAssignment.Programming1;

public class Circle extends Shapes{
    private double radius;
    private double PI;

    public Circle() {
        super();
    }

    //constructor
    public Circle(double radius, double PI) {
        this.radius = radius;
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //implement the abstract method
    @Override
    public void calculateArea() {
        area=PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", area=" + area +
                '}';
    }

}