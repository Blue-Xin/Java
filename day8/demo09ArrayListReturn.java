package day8;

import java.util.ArrayList;
import java.util.Random;

public class demo09ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int n = r.nextInt(20) + 1;
            bigList.add(n);
        }
        ArrayList<Integer> getList = getSmallList(bigList);
        for (int i = 0; i < getList.size(); i++) {
            System.out.println(getList.get(i));
        }
    }
//
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}
