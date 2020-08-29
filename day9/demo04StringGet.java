package day9;

/*
String当中与获取相关的常用方法有：
public int length()：获取字符串中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
*/
public class demo04StringGet {
    public static void main(String[] args) {
        //获取字符长度
        int length = "asfdsdgdsgwefxsfdsa".length();
        System.out.println(length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello
        System.out.println(str2);//World
        System.out.println(str3);//HelloWorld
        System.out.println("======================");
        //获取指定索引位置的单个字符
        char ch = "hello".charAt(1);
        System.out.println("在一号位置的字符是：" + ch);
        System.out.println("======================");
        String str4 = "HelloWorld";
        int n = str4.indexOf("llo");
        System.out.println("第一次索引值是"+n);

        System.out.println("HelloWorld".indexOf("abc"));
    }
}
