package day14.demo01;
/*
在任何版本中，接口都能定义抽象方法

1.public abstract 返回值类型 方法名称(阐述列表);
2.两个关键字修饰符，可以选择性地省略。（刚学不推荐）
3.方法三要素可以随意定义。
*/
public interface MyInterfaceAbstract {
    //这是一个抽象方法
    public abstract void methodAbs1();

    //这也是抽象方法
    abstract void methodAbs2();

    //这也是抽象方法
    public void methodAbs3();

    //这也是抽象方法
    void methodAbs4();
}
