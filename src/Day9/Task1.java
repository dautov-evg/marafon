package Day9;

public class Task1 {
    public static void main(String[] args) {
        Student st1 = new Student("Леха","113");
        Teacher t1 = new Teacher("АНДРЮХА","математика");
        System.out.println(st1.getNameGroup());
        System.out.println(t1.getNameLesson());
        System.out.println();
        st1.printInfo();
        t1.printInfo();
    }
}
