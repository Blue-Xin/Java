package day10;

public class Student {
    private String name;
    private int age;
    private int id;
    static String room;
    private static int idCount = 0;//学号计数器，没new一个对象就会++

    public Student() {
        this.id = ++idCount;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
