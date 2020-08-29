package day9;

/*
==是进行对象的的地址比较，如果确实需要字符串的内容比较，可以使用两个方法：
public boolean equals(Object obj)：参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true；否则返回false
注意事项：
1.任何对象都能用Object进行接收
2.equals方法具有对称性，也就a.equals(b)和b.equals(a)
3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
推荐："abc".equals(str）      不推荐：str.equals("abc")

public boolean equalsIgnoreCase(String str):忽略大小写，进行内容比较。
*/
public class demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        String str4 = "Hello";
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println(str4.equals(str3));
        System.out.println("=========================");
        String str5 = null;
        System.out.println("abc".equals(str5)); //推荐   false
//        System.out.println(str5.equals("abc")); //不推荐  空指针报错
        System.out.println("=========================");
        String strA = "java";
        String strB = "Java";
        System.out.println(strA.equals(strB));  //false 严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));
//        注意只有英文字母区分大小写，其它不区分大小写
        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));// false
    }
}
