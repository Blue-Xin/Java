package day10;

public class demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("小王", 20);
        one.room = "北京长安街101";
        System.out.println("姓名：" + one.getName() +
                ",年龄：" + one.getAge() + ",地址：" + one.room + ",学号：" + one.getId());
        Student two = new Student("小张", 19);
        System.out.println("姓名：" + two.getName() +
                ",年龄：" + two.getAge() + ",地址：" + two.room + ",学号：" + two.getId());
    }
}
