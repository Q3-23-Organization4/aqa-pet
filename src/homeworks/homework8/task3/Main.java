package homeworks.homework8.task3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapesType = new Shape[]{
                new Circle("Red", 51, 4.68, 60),
                new Rectangle("Blue", 14.68, 4.0, 6.0,56),
                new Triangle("Green", 5.5, 5.8, 3.0, 4.0,5)
        };

        for (Shape shape : shapesType) {
            shape.paint();
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
            System.out.println();
        }
    }
}
