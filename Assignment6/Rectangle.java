package NUIGAssignment.Programming1;

public class Rectangle extends Shapes{
    private double length;
    private double width;
    //default constructor
    public Rectangle() {
        super();
    }
    //constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //get the length of Rectangle
    public double getLength() {
        return length;
    }
    //set the length of Rectangle
    public void setLength(double length) {
        this.length = length;
    }
    //get the width of Rectangle
    public double getWidth() {
        return width;
    }
    //set the length of Rectangle
    public void setWidth(double width) {
        this.width = width;
    }

    //implement the abstract method
    @Override
    public void calculateArea() {
       this.area=width*length;
    }
    //override ToString
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}
