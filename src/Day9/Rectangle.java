package Day9;

public class Rectangle extends Figure{
    private double shirina;
    private double visota;

    public Rectangle(String color, double shirina, double visota) {
        super(color);
        this.shirina = shirina;
        this.visota = visota;
    }

    @Override
    public double area() {
        return (shirina*visota);
    }

    @Override
    public double perimeter() {
        return ((2*shirina)+(2*visota));
    }
}
