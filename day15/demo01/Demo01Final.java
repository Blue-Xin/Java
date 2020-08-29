package day15.demo01;

/*
final关键字代表最终、不可变的。

常见四种用法：
1.可以用来修饰一个类
2.可以用来修饰一个方法
3.还可以用来修饰一个局部变量
4.还可以用来修饰一个成员变量
*/
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        //一旦使用final用来修饰局部变量，那么这个变量就不能更改。
        //"一次赋值，终生不变"
        final int num2 = 100;
        System.out.println(num2);

//        num2 = 300;  //错误写法，不能改变
//        num2 = 100;  //错误写法
        //正确写法，只要保证有唯一一次赋值即可
        final int num3;
        num3 = 300;

        //对于基本类型来说，不可变说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变
        Student stu1 = new Student("小明");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("小张");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("=======================");

        final Student stu2 = new Student("小李");
        System.out.println(stu2.getName());
        //错误写法！final的引用类型变量，其中地址不可以改变
//        stu2 = new Student("小杨");
        stu2.setName("小李子");
        System.out.println(stu2.getName());
    }
}
