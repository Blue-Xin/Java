package day11;

import java.util.Arrays;
//将一串字符串排序额，然后倒序打印
public class demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "asghjtyycbrtjfgfh";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
