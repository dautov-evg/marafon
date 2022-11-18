package Day9;

public class Circle extends Figure{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI*(radius*radius));
    }

    @Override
    public double perimeter() {
        return (2*Math.PI*radius);
    }
}
