package Day9;

public class Triangle extends Figure{
    private double st1,st2,st3;

    public Triangle(String color, double st1, double st2, double st3) {
        super(color);
        this.st1 = st1;
        this.st2 = st2;
        this.st3 = st3;
    }

    @Override
    public double area() {
        double p2=(st1+st2+st3)/2;
        return Math.sqrt(p2*(p2-st1)*(p2-st2)*(p2-st3));
    }

    @Override
    public double perimeter() {
        return (st1+st2+st3);
    }
}
