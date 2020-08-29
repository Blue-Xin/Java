package day2;

public class demo2 {
    public static void main(String[] args) {
        Student stu1 = getStudent();
        System.out.println(stu1.str);
        System.out.println(stu1.age);
    }

    public static Student getStudent() {
        Student stu = new Student();
        stu.age = 20;
        stu.str = "李华";
        return stu;
    }
}
