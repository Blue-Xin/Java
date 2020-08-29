package day7;

import java.util.Random;
import java.util.Scanner;

/*
题目：
用代码模拟猜数字小游戏。


*/
public class demo04Game {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("请输入你猜的数字：");
            int guessNum = sc.nextInt();
            if(guessNum < randomNum){
                System.out.println("猜小了");
            }
            else if(guessNum > randomNum){
                System.out.println("猜大了");
            }
            else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
