package day9;

/*
String当中与转换相关的常用方法有：

public char[] toCharArray()：将当前字符串拆分成字符数组作为返回值。
public byte[] getBytes()：获得当前字符串底层的字节数组、
public String replace(CharSequence oldString, CharSequence newString):
将所有出现的老字符串替换为新的字符串，返回替换之后的结果新字符串。
备注： CharSequence 的意思就是说可以接受字符串类型
*/
public class demo06StringConvert {
    public static void main(String[] args) {
//        转换成为字符数组
        char[] ch = "HelloWorld".toCharArray();
        System.out.println(ch[0]);
        System.out.println(ch.length);
        String str = "HelloWorld";
        char[] chars = str.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("=============================");
//        转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=============================");
//        字符串的内容替换
        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("=============================");
        String lang1 = "你大爷的";
        String lang2 = lang1.replace("大爷", "**");
        System.out.println(lang2);
    }
}