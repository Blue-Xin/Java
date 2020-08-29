package day9;

import java.util.Scanner;

public class demo09Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input = sc.next();

        int countUpper = 0;//大写字母
        int countLower = 0;//小写字母
        int countNumber = 0;//数字
        int countOther = 0;//其它

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='A' && chars[i]<='Z'){
                countUpper++;
            }else if(chars[i]>='a' && chars[i]<='z'){
                countLower++;
            }else if(chars[i]>='0' && chars[i]<='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母："+countUpper);
        System.out.println("小写字母："+countLower);
        System.out.println("数字："+countNumber);
        System.out.println("其它："+countOther);
    }
}
