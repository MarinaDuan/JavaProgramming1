package NUIGAssignment.Programming1;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {

    public static void main(String[] args) {
        //arraylist to store shapes
        ArrayList<Shapes> shapes = new ArrayList<Shapes>();
        Circle l1 = new Circle(5, 3.14);
        shapes.add(l1);
        l1.calculateArea();
        Rectangle l2 = new Rectangle(3, 5);
        shapes.add(l2);
        l2.calculateArea();
        Circle l3 = new Circle(4.5, 3.14);
        shapes.add(l3);
        l3.calculateArea();
        Rectangle l4 = new Rectangle(3.5, 4.8);
        shapes.add(l4);
        l4.calculateArea();
        //print the shape
        System.out.println("largest shape in the collection:" + largestShape(shapes));
    }

    //compare the shapes
    public static Shapes largestShape(List<Shapes> shapes) {
        System.out.println("The List Array includes following shapes:");
        Shapes largestShape = shapes.get(0);
        for (int i = 0; i < shapes.size(); i++) {
            //print every shape in array list
            System.out.println(shapes.get(i));
            //If shape i>current largest, assign its value to largest
            if (shapes.get(i).compareShapes(largestShape) == -1) {
                largestShape = shapes.get(i);
            }
        }
        return largestShape;
    }
}
