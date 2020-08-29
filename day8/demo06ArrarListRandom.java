package day8;

import java.util.ArrayList;
import java.util.Random;

public class demo06ArrarListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int n = r.nextInt(33)+1;
            list.add(n);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
