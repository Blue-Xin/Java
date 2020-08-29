package day11;
/*
题目
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？

分析：
1.既然已经确定了范围，for循环
2.起点位置-10.8应该转换成为-10，两种方法：
     可以使用Math.seil方法，向上取整
     也可以强制类型转换成为int，自送舍弃小数位
3.每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的。
4.如何拿到绝对值：Math.abs方法
5.一旦发现了一个数字，需要计数器++进行统计。
*/

public class demo04MathPractise {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int num = 0;
        //这样处理，变量i就是区间之内的所有整数
        for (int i = (int) min; i < max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                System.out.println(i);
                num++;
            }
        }
        System.out.println("满足条件共有："+num+"个");
    }
}
