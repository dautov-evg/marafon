package Day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов Иван Иванович", "География");
        Student student = new Student("Хуй мамин");
        teacher.evaluate(student);
    }
}
