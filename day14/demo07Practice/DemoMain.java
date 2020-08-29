package day14.demo07Practice;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建了一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
        //首先进行向上转型
        USB usbMouse = new Mouse();//多态写法
        //参数式USB类型，正好传递进去的就是USB鼠标
        computer.usbDevice(usbMouse);

        //创建一个USB键盘
        KeyBoard keyBoard = new KeyBoard();//没有使用多态写法
        //方法参数是USB类型，传递进去的是实现类对象
        //computer.usbDevice(keyBoard);//正确写法!也发生了向上转型
        //使用子类对象，匿名对象，也是可以
        computer.usbDevice(new KeyBoard());//也是正确写法

        computer.powerClose();
        System.out.println("==========================");
        method(10.0);//正确写法double-->double
        method(10);//正确写法int-->double
    }

    public static void method(double num) {
        System.out.println(num);
    }
}
