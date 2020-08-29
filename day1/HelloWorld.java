package day1;
import day2.Student;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("hello!");
        System.out.println("hello!");
       Student stu=new Student();
       stu.A();
       stu.B();
       stu.str="你好";
       stu.age=20;
        System.out.println(stu.str);
        System.out.println(stu.age);
    }


}