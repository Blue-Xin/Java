package day5;

import java.util.Scanner;

/*
1.导包
import 包路径.类名称
只有java.lang包下内容不需要导包，其它都需要导包

2.创建
类名称  对象名 = new 类名称();

3.使用
对象名.成员方法名();

获取键盘输入的一个int数字： int num = nextIn();
获取键盘输入的一个字符串： String str = next();
*/
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
