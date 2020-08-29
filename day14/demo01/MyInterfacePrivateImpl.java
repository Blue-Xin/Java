package day14.demo01;

public class MyInterfacePrivateImpl implements MyInterfacePrivateA{
    public void methodAnother(){
        //直接访问到了接口当中默认方法，这样是错误的！
//        methodCommon();

    }
}
