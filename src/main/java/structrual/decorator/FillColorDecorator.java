package structrual.decorator;

public class FillColorDecorator extends ShapeDecorator {
    public String color;

    public FillColorDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        System.out.println("Fill Color: " + this.color);
    }

    @Override
    public void resize() {
        this.decoratedShape.resize();
    }

    @Override
    public String description() {
        return this.decoratedShape.description() + " filled with " + this.color + " color.";
    }

    @Override
    public boolean isHide() {
        return this.decoratedShape.isHide();
    }
}
