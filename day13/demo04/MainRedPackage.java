package day13.demo04;

import java.util.ArrayList;

public class MainRedPackage {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);
        manager.show();
        one.show();
        two.show();
        three.show();
        //群主总共发20块钱    分成三份
        ArrayList<Integer> List = manager.send(20,3);
        //三个人收红包
        one.receive(List);
        two.receive(List);
        three.receive(List);
        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
