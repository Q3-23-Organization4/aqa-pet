package homeworks.homework8.task3;

import java.util.Objects;

public abstract class Shape {
    protected String color;
    protected double x;
    protected double y;

    public Shape(String color,double x, double y){
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract void paint();

    @Override
    public int hashCode() {
        return Objects.hash(color, x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Shape shape = (Shape) obj;
        return Double.compare(shape.x, x) == 0 &&
                Double.compare(shape.y, y) == 0 &&
                Objects.equals(color, shape.color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
