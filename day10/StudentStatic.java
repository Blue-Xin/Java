package day10;

public class StudentStatic {
    public static void main(String[] args) {
        Student.room = "101教室";

        Student one = new Student("张三", 20);
        System.out.println("one的教室：" + Student.room);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("==============================");
        Student two = new Student("李四", 19);
        System.out.println("two的教室：" + Student.room);
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());

    }
}
