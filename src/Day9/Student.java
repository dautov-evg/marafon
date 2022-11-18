package Day9;

public class Student extends Human{
    private String nameGroup;

    public Student(String name, String nameGroup) {
        super(name);
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Это студент с именем "+super.getName());
    }
}
