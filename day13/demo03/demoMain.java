package day13.demo03;

public class demoMain {
    public static void main(String[] args) {
//        Animal animal = new Animal();    //错误

//        Dog dog = new Dog();     //错误
        Dog2ha ha = new Dog2ha();
        ha.eat();
        ha.sleep();
        System.out.println("======================");
        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();
    }
}
