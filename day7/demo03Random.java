package day7;

import java.util.Random;
import java.util.Scanner;
/*
题目要求
产生1~n的随机数[1,n];
*/
public class demo03Random {
    public static void main(String[] args) {
        System.out.print("请输入随机数范围：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(a) + 1; // 整体+1，原本[0,n),就变成了[1,n]
            System.out.println(num);
        }
    }
}

