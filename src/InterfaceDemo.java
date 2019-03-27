/**
 * @program: Study
 * @Date: 2019/3/27 9:35
 * @Author: Mr.Ran
 * @Description:
 */
/*
接口：初期理解，可以认为是一个特殊的抽象类
     当抽象类中的方法都是抽象的，那么该类就可以通过接口的形式来表示。
class用于定义类
interface 用于定义接口。

接口定义时，格式特点：
1、接口中常见定义：常量、抽象方法。
2、接口中的成员都有固定的修饰符。
    常量：public static final
    方法：public abstract
记住：接口中的成员都是public的。

接口：是不可以创建对象的，因为有抽象方法。
需要被子类实现，子类对接口中的抽象方法全都覆盖后，子类才可以实例化。
否则子类是一个抽象类。

接口可以被类多实现，也是对多继承不支持的转换形式。java支持多实现。接口可以实现多继承
 */
interface Inter{
    public static final int NUM = 3;//final、public、static、abstract没写没关系，只要是interface都会自动加上
    public abstract void show();//void 不能省略，写的时候最好写全，好看懂代码。
}

interface InterA{
//    public abstract void method();
    public abstract void show();
}

class Test extends DemoA implements Inter,InterA{
    public void show(){}
//    public void method(){}
}

class DemoA{
    public void function(){}
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.NUM);//对象调用
        System.out.println(Test.NUM);//类调用
        System.out.println(Inter.NUM);//也可以
        //这三者任意一个都不能对NUM进行赋值，因为NUM是一个常量。
    }
}


