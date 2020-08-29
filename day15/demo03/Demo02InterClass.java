package day15.demo03;

public class Demo02InterClass {
    public static void main(String[] args) {
        Outer.Innter obj = new Outer().new Innter();
        obj.methodInner();
    }
}
