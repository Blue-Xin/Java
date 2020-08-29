package day6;

import java.util.Scanner;

public class demo02anonymous {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        匿名对象方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是" + num);
        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParan(sc);
        //使用匿名对象传参
//        methodParan(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是" + num);

        num = new Scanner(System.in).nextInt();
        System.out.println("输入的是" + num);

        methodParan(new Scanner(System.in));
    }

    public static void methodParan(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {
        //普通方式
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
