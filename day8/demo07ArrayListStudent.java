package day8;

import java.util.ArrayList;

/*
题目：
自定义4个对象，添加到集合，并遍历。

思路：
1.自定义一个Student学生类，四个部分。
2.创建集合，用来储存学生对象。泛型：<Student>
3.根据类创建4个学生对象。
4.将4个学生对象添加到集合中：add
5.遍历集合：for、size、get。
*/
public class demo07ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("小李", 22);
        Student two = new Student("小王", 21);
        Student three = new Student("小张", 20);
        Student four = new Student("小刘", 32);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getName()+"今年");
            System.out.println(list.get(i).getAge()+"岁");
        }
    }
}
