package day4;

public class demo01 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student(20 , "李华");
        System.out.println(stu2.getAge());
        System.out.println(stu2.getName());


    }
}
