package day6;

/*
创建对象标准格式
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称();


注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
*/
public class demo01anonymous {
    public static void main(String[] args) {
        Person per = new Person();
        per.name = "王芳";
        per.showName();
        System.out.println("===========================");
        new Person().name = "李华";
        new Person().showName();//结果为null
    }
}
