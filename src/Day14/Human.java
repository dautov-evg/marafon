package Day14;

public class Human {
    private String name;
    private int year;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст: " + year;
    }

    public Human(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
