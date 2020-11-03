package structrual.decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape; //polymorphism

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
}
