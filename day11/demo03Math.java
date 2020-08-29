package day11;
/*
* java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的的操作。
* public static double abs(double num):获取绝对值
*public static double ceil(double num):向上取整
*public static double floor(double num):向下取整
*public static long round(double num):四舍五入
*
* Math。PI代表近似的圆周率（double）
*  */
public class demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(-124));
        System.out.println(Math.abs(-1.4));
        System.out.println("==================");

        //向上取整
        System.out.println(Math.ceil(4.7));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.ceil(4.0));
        System.out.println("==================");

        //向下取整,抹零
        System.out.println(Math.floor(12.7));
        System.out.println(Math.floor(12.0));
        System.out.println("==================");

        //四舍五入
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(20.4));
    }
}
