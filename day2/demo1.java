package day2;

public class demo1 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.age=20;
        stu.str="李华";
        stu.A();
        System.out.println("姓名："+stu.str);
        System.out.println("年龄："+stu.age);
        stu.B();
        method(stu);
    }

    public static void method(Student one) {
        System.out.println(one.age);
        System.out.println(one.str);
    }
}
