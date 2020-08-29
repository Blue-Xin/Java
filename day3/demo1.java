package day3;

public class demo1 {
    public static void main(String[] args) {
        Person per = new Person();
        per.setAge(20);
        per.setName("李华");
        per.setMale(true);
        System.out.println("年龄：" + per.getAge());
        System.out.println("姓名：" + per.getName());
        System.out.println("是不是男性：" + per.isMale());
    }
}
