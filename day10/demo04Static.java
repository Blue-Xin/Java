package day10;
/*
静态代码块的格式是：
public class{
    static{
        //静态代码块的内容
    }
}
特点：当你第一次使用到本类是，静态代码块执行唯一的一次
静态内容总是优先于非静态，所以静态代码比构造方法先执行。

静态代码块的典型用途：
用一次性地对静态成员函数变量进行赋值。
*/
public class demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
