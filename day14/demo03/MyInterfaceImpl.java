package day14.demo03;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("子接口的方法");
    }

    @Override
    public void methodA() {
        System.out.println("父类接口A的方法");
    }

    @Override
    public void methodB() {
        System.out.println("父类接口A的方法");
    }

    @Override
    public void methodCommon() {
        System.out.println("父类接口A和B共有的方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("父类接口A和B共有的默认方法");
    }
}
