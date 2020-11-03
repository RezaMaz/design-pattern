package structrual.decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new FillColorDecorator(new Circle(), "Red");
        Shape rectangle1 = new FillColorDecorator(new Rectangle(), "Green");
        circle1.draw();
        System.out.println();
        rectangle1.draw();
    }
}
