package module1week4;

public class Student {
    protected String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void notAThing () {
        System.out.println("Cannot initiate connection! " + name + " is not a thing!");
    }
}
