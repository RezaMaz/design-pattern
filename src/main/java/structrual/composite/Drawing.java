package structrual.composite;

import java.util.ArrayList;
import java.util.List;

//Composite Object

/**
 * Composite pattern should be applied only when the group of objects should behave as the single object.
 * Composite design pattern can be used to create a tree like structure.
 */
public class Drawing implements Shape {
    private List<Shape> shapeList = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape shape : shapeList) {
            shape.draw(fillColor);
        }
    }

    public void add(Shape s) {
        this.shapeList.add(s);
    }

    //removing shape from drawing
    public void remove(Shape s) {
        shapeList.remove(s);
    }

    //removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapeList.clear();
    }
}
