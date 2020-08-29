package day11;

import java.util.Arrays;

/*java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，来实现数组的常见操作

public static String toString(数组):将参数数组变成字符串(按默认格式：[元素1，元素2，元素3......])
public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序。

备注：
1.如果是数值，sort默认按照升序排大小。
2.如果是字符串，sort默认按照字母升序。
3.如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持
*/
public class demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        //讲int数组安装默认格式变成字符串
        String str = Arrays.toString(intArray);
        System.out.println(str); //   [10, 20, 30]
        int[] array1 = {123,34,1,5,4,74,2,4};
        Arrays.sort(array1);
        System.out.println("===================");
        System.out.println(Arrays.toString(array1)); //  [1, 2, 4, 4, 5, 34, 74, 123]
        String[] str2 = {"bbb","aaa","ccc"};
        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));
    }
}
