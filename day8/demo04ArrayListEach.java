package day8;

import java.util.ArrayList;

public class demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小李");
        list.add("小王");
        list.add("小张");
        list.add("小杨");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
