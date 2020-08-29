package day8;

/*
题目：
定义一个数组，用来储存3个Person对象
*/
public class demo01Array {
    public static void main(String[] args) {
//      首先创建一个长度为3的数组，用来存放Person类型对象
        Person[] array = new Person[3];

        Person one = new Person("小明", 20);
        Person two = new Person("王芳", 19);
        Person three = new Person("小王", 21);
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);//地址值
        System.out.println(array[1]);//地址值
        System.out.println(array[2]);//地址值

        System.out.println(array[1].getName());//王芳
        System.out.println(array[1].getAge());//19
    }
}
