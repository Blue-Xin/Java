package day10;

public class MyClass {
    int num;//成员变量
    static int numSratic;//静态变量
        public void method(){
            System.out.println("这是一个成员方法");
            //成员方法可以访问成员变量
            System.out.println(num);
            //成员方法可以访问静态变量
            System.out.println(numSratic);
        }
        public static void methodStatic(){
            System.out.println("这是一个静态方法");
            //静态方法可以访问静态变量
            System.out.println(numSratic);
            //静态方法不能访问成员变量
//            System.out.println(num);  写法错误
            //静态方法中不能使用this关键字
//            System.out.println(this);
        }
}
