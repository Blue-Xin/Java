package day12.demo07;

public class Zi extends Fu{
    public Zi(){
//        super();  //在调用父类无参构造方法
        super(10);
        System.out.println("子类构造方法");
    }
}
