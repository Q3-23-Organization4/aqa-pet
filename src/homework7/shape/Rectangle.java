package homework7.shape;

public class Rectangle extends Shape {

    private final double height;
    private final double width;

    public Rectangle(String color,double x, double y, double height, double width) {
        super(color, x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void paint() {
        super.paint();
        System.out.println("Rectangle");
    }
}
