package day14.demo07Practice;

public class Computer {
    public void powerOn() {
        System.out.println("笔记本开机");
    }

    public void powerClose() {
        System.out.println("笔记本关机");
    }

    //使用USB设备的方法，使用接口作为方法的参数
    public void usbDevice(USB usb) {
        usb.open();//打开设备
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.type();
        }
        usb.close();//关闭设备
    }
}
