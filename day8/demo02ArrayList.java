package day8;

import java.util.ArrayList;

/*
数组长度不可以发生改变。
但是ArrayList集合的长度可以随意变化的。

对于ArrayList来说，有一个<E>代表泛型
泛型：也就是装在集合当中的所有元素，全部是统一的什么类型。
注意：泛型只能是引用类型，不能是基本类型

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
入伙内容是空，得到的是空的中括号：[]
*/
public class demo02ArrayList {
    public static void main(String[] args) {
//创建了一个ArrayList集合，集合名称是list，里面装的全部是String字符串类型数据
//备注：从JDK 1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);// []

        //向集合当中添加书籍，需要add方法
        list.add("小李");
        list.add("小王");
        list.add("小张");
        list.add("小杨");
        System.out.println(list);//[小李, 小王, 小张, 小杨]
    }
}
