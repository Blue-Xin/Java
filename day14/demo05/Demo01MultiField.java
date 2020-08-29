package day14.demo05;
/*
访问成员变量的两种方式：

1.直接通过对象名称访问成员变量：看等号左边是谁，谁就优先使用，没有则向上找。
2.间接访问用过成员方法访问成员变量
*/
public class Demo01MultiField {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age);  //错误写法
        System.out.println("=====================");
        //子类没有覆盖重写，就是父类的：10
        //子类如果覆盖重写，就是子类的：20
        obj.showNum();
    }
}
