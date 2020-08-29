package day12.demo01;

/*在继承中"子类就是一个父类"。也就是说，子类可以被当成父类看待。
* 假如父类是员工，那么子类是讲师，那么"讲师也是一个员工"，关系：is-a。
*
* 定义父类的格式：(一个普通的定义)
*public class 父类名称{
*    //..........
* }
*
* 定义子类的格式：
* public class 子类名称 extends 父类名称{
*    //.........
* }
* */
public class demo01Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher = new Teacher();
        //Teacher类当中虽然什么也没写，但是会继承来之弗雷德方法method的方法。
        teacher.method();

        //创建另一个子类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
