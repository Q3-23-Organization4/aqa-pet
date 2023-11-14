package homework8.task3;

import java.util.Objects;

public class Triangle extends Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle (String color,double x, double y, double side1, double side2, double side3){
        super(color, x, y);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void paint() {
        System.out.println("Triangle");
        System.out.println(x + " " + y + " " + side1 + " " + side2 + " " + side3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(side1, triangle.side1) == 0 && Double.compare(side2, triangle.side2) == 0 && Double.compare(side3, triangle.side3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side1, side2, side3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
