package Day9;

public class TestFigure {
    public static void main(String[] args){
        Figure[] figures = {
                new Triangle ( "Red" , 10 , 10 , 10 ),
                new Triangle ( "Green" , 10 , 20 , 30 ),
                new Triangle ( "Red" , 10 , 20 ,15 ),
                new Rectangle ( "Red" , 5 ,10 ),
                new Rectangle ( "Orange" , 40 ,15 ),
                new Circle ( "Red" ,4),
                new Circle ( "Red" ,10 ),
                new Circle ( "Blue" ,5 )
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }
    public static double calculateRedPerimeter(Figure[] figures) {
        double perim=0;
        for (int i=0;i< figures.length;i++) {
            if (figures[i].getColor().equals("Red")) {
                perim+=figures[i].perimeter();
            }
        }
        return perim;
    }
    public static double calculateRedArea(Figure[] figures) {
        double plosh=0;
        for (int i=0;i< figures.length;i++) {
            if (figures[i].getColor().equals("Red")) {
                plosh+=figures[i].area();
            }
        }
        return plosh;
    }
}
