package NUIGAssignment.Programming1;

public abstract class Shapes implements ShapesRelate{
    protected double area;
    //default constructor
    public Shapes() {
        area=0;
    }
    //constructor
    public double getArea() {
        return area;
    }

    public abstract void calculateArea();
    //implement
    @Override
    public int compareShapes(ShapesRelate shape0) {
        //Cast ShapesRelate object shape() into shapes object
        Shapes shape1=(Shapes)shape0;
        //shapes is shape. if the next shape>=the current shape, return -1
        if(shape1.getArea()>this.getArea()){
            return 1;
        }
        else if(shape1.getArea()<this.getArea()){
            return-1;
        }
        else{
            return 0;
        }
    }
}
