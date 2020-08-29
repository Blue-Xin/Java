package day9;
/*
字符串截取方法：
public String substring(index)：截取从参数位置一直到字符串末尾，返回新字符串。
public String substring(int begin , int end)：截取从begin到end中间的字符串
备注：[begin , ens),包含左边，不包含右边。
*/
public class demo05SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);//HelloWorld
        System.out.println(str2);//World
        System.out.println("============================");
        String str3 = str1.substring(0,5);
        System.out.println(str3);
        //下面这种写法，字符串的内容仍然没有改变的
        //下面有两个字符串："Hello"，"Java"
        //strA当中保存的是地址值。
        //本来地址值是Hello的；
        //后来地址值变成了Java的；
        String strA = "Hello";
        System.out.println(strA);//Hello
        strA= "Java";
        System.out.println(strA);//Java
    }
}
