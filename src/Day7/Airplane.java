package Day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel=0;
    }

    public void info() {
        System.out.println("Изготовитель: "+ producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int fill) {
        fuel+=fill;
        System.out.println("Бак заправлен на " + fill);
        System.out.println("Количество топлива в баке: " + fuel);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public static void compareAirplanes(Airplane a1, Airplane a2) {
        if (a1.getLength()> a2.getLength()) {
            System.out.println("Первый самолет длиннее");
        } else if (a1.getLength()< a2.getLength()) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины одинаковые");
        }
    }
}
