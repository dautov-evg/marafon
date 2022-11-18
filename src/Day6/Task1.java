package Day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2000);
        car.setColor("Желтая");
        car.setModel("Lamba");
        System.out.println(car.getYear()+", "+car.getColor()+", "+car.getModel());
        car.info();
        System.out.println(car.yearDifference(2020));
        System.out.println();
        Motorbike motorbike = new Motorbike(2015,"black","suzuki");
        System.out.println(motorbike.getYear()+", "+motorbike.getColor()+", "+motorbike.getModel());
        motorbike.info();
        System.out.println(motorbike.yearDifference(1000));
    }
}
