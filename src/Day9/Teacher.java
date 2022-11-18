package Day9;

public class Teacher extends Human{
    private String nameLesson;

    public Teacher(String name, String nameLesson) {
        super(name);
        this.nameLesson = nameLesson;
    }

    public String getNameLesson() {
        return nameLesson;
    }

    public void setNameLesson(String nameLesson) {
        this.nameLesson = nameLesson;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Это преподаватель с именем "+super.getName());
    }
}
