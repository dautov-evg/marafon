package Day6;
import java.util.Random;
public class Teacher {
    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }
    public void evaluate(Student student) {
        String est = null;
        Random random = new Random();
        int estimation = random.nextInt(4)+2;
        switch (estimation) {
            case 2:
                est="неудовлетворительно";
                break;
            case 3:
                est="удовлетворительно";
                break;
            case 4:
                est="хорошо";
                break;
            case 5:
                est="отлично";
                break;
        }
        System.out.println("Преподаватель "+ name + " оценил студента " + student.getName() + " по предмету " + object + " на оценку " + est + ".");
    }
}
