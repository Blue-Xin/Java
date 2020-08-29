package day15.demo03;

//如果出现重名现象，那么格式是：外部类名称.this.外部外部成员变量名
public class Outer {
    int num = 10;//外部类的成员变量

    public class Innter {
        int num = 20;//内部类的成员变量

        public void methodInner() {
            int num = 30;//内部类的方法的局部变量
            System.out.println(num);//局部变量，就近原则
            System.out.println(this.num);//内部类的成员变量
            System.out.println(Outer.this.num);//外部类的成员变量
        }
    }
}
