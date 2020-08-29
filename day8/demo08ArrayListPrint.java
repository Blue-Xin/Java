package day8;

import java.util.ArrayList;

/*
题目：
定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}括起集合，使用@分隔每个元素。
格式{元素@元素@元素}
*/
public class demo08ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("邓紫棋");
        list.add("汪峰");
        list.add("周深");
        System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i==list.size()-1){
                System.out.print(list.get(i)+"}");
            }
            else{
                System.out.print(name + "@");
            }
        }
    }
}
