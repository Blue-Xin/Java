package day4;

public class Student {
    private int age;
    private String name;

    public Student() {
        System.out.println("无参构造函数执行");
    }

    public Student(int age, String name) {
        System.out.println("有参构造函数执行");
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;

    }
}
