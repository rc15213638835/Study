/**
 * @program: Study
 * @Date: 2019/4/1 16:58
 * @Author: Mr.Ran
 * @Description:
 */
/*
匿名内部类：
1、匿名内部类其实就是内部类的简写格式。
2、定义匿名内部类的前提：
    内部类必须时继承一个类或者实现接口。
3、匿名内部类的格式：new 父类或者接口(){定义子类的内容}
4、其实匿名内部类就是一个匿名子类对象。而且这个对象有点胖。可以理解为带内容的对象。
5、匿名内部类中定义的方法最好不要超过3个。


 */
abstract class AbsDemo{
    abstract void show();//抽象不能new
}
class Outer{
    int x = 3;
    /*class Inner extends AbsDemo{
        void show(){//复写抽象方法
            System.out.println("show:"+x);
        }
        void abc(){
            System.out.println("haha");
        }

    }*/
    public void function(){
//        new Inner().show();
//        AbsDemoa = new Inner();
//        a.show();
//        a.abc();
//        Inner in = new Inner();
//        in.show();
//        in.abc()；


        AbsDemo a = new AbsDemo(){
            void show(){
                System.out.println("x="+x);
            }
            void abc(){
                System.out.println("haha");
            }
        };//AbsDemo的匿名子类对象
//        d.show();
//        d.abc();//编译失败；

        new AbsDemo(){//匿名对象只能调用方法一次，如果要用只有在写一次。
            void show(){
                System.out.println("x="+x);
            }
            void abc(){
                System.out.println("haha");
            }
        }.abc();//AbsDemo的匿名子类对象

    }
}
public class InnerClassDemo4 {
    public static void main(String[] args) {
        new Outer().function();

    }
}
