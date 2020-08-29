package day9;
/*
分割字符串的方法：
public String[] split(String regex)：按照参数的规制，将字符串切分为若干部份。

注意事项：
split防范的参数其实是一个"正则表达式"，今后学习。
今天要注意：如果按照英文句点"."进行划分，必须写"\\."（两个反斜杠）
*/
public class demo07StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] strings1 = str1.split(",");
        for (int i = 0; i < strings1.length; i++) {
            System.out.println(strings1[i]);
        }
        System.out.println("=========================");
        String str2 = "aaa bbb ccc";
        String[] strings2 = str2.split(" ");
        for (int i = 0; i < strings2.length; i++) {
            System.out.println(strings2[i]);
        }
        System.out.println("=========================");
        String str3 = "xxx.yyy.zzz";
        String[] strings3 = str3.split(".");
        System.out.println(strings3.length);   // 长度为 0
        for (int i = 0; i < strings3.length; i++) {
            System.out.println(strings3[i]);
        }
        System.out.println("=========================");
        String str4 = "xxx.yyy.zzz";
        String[] strings4 = str3.split("\\.");
        System.out.println(strings4.length);   // 长度为 0
        for (int i = 0; i < strings4.length; i++) {
            System.out.println(strings4[i]);
        }
    }
}
