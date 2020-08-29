package day12.demo04;
/*
* 在父子类的继承当中，创建子类对象，访问成员方法的规则：
*   创建对象是谁，就优先用谁，如果没有就向上找。
*
* 注意事项：
* 无论是成员方法还是成员变量，如果没有就是向上找父类，绝不会向下找子类的。
*
* 重写（override）
* 概念：在继承关系当中，方法的名称一样，参数列表也一样。
*
* 重写（override）：方法的名称一样，参数列表【也一样】。覆盖  覆写。
* 重载（overload）：方法的名称一样，参数列表【不一样】。
*
* 方法的覆盖重写特点：创建的是子类对象，则优先用子类方法
*/
public class demo01ExtendField {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();

        //创建的是new了子类对象，所以优先用子类方法
        zi.method();
    }

}
