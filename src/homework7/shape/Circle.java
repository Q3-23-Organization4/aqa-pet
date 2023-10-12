package homework7.shape;

public class Circle extends Shape {
    private final double radius;

    public Circle(String color,double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void paint() {
        super.paint();
        System.out.println("Circle");
    }
}