package day8;

import java.util.ArrayList;

/*
Arraylist当中的常用方法有：

public boolean add(E e): 向集合当中添加元素，参数的类型和泛型一致
备注：对于ArrayList来说添加动作一定会成功的，所以返回值可用可不用
但是对于其他集合（今后学习）来说，add添加动作不一定成功。

public E get(int index):从集合当中获取元素，参数是索引编号，返回值类型就是对应位置的元素

public E remove(int index):从集合当中删除元素，参数式是索引编号，返回值就是被删除掉的元素。

public int size(): 获取集合的尺寸长度，返回值是集合中包含的元素个数
*/
public class demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
//        向集合中添加元素
        boolean success = list.add("小明");//[小明]
        System.out.println(list);
        System.out.println("添加是否成功：" + success);//true
        list.add("小李");
        list.add("小王");
        list.add("小张");
        list.add("小杨");
        System.out.println(list);
//        从集合中获取元素：get 索引值从0开始
        String name = list.get(2);
        System.out.println("第二号索引位置：" + name);
//        从集合中删除元素： remove 索引值从0开始
        String delete = list.remove(2);
        System.out.println(list);//[小明, 小李, 小张, 小杨]
        System.out.println("被删除的人是:" + delete);//被删除的人是:小王
        int num = list.size();
        System.out.println("数组长度为：" + num);//数组长度为：4
    }
}
