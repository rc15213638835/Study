/**
 * @program: Study
 * @Date: 2019/3/25 15:54
 * @Author: Mr.Ran
 * @Description:
 */
/*
子父类出现后，类成员的特点：

类中成员：
1、变量。
2、函数。
3、构造函数。

1、变量
如果子类中出现非私有的同名成员变量时，
子类要访问本类中的变量，用this
子类要访问父类中的同名变量，用super。

super的使用和this几乎一致。
this代表的是本类对象的引用。
super代表的是父类对象的引用。
 */
/*
2、子父类中的函数。
当子类出现和父类一模一样的函数时，
当子类对象调用该函数。会运行子类函数的内容。
如同父类的函数被覆盖一样。

这种情况时函数的另一个特性：重写（覆盖）
当子类继承父类，沿袭了父类的功能，到子类中，
但是子类虽然具备该功能，但是功能的内容却和父类不一致，
这时，没有必要定义新功能，而是使用覆盖特殊，保留父类的功能定义，并重写功能内容。

 覆盖：
 1、子类覆盖父类，必须保证子类权限大于等于父类权限，才可以覆盖，否则编译失败。
 2、静态只能覆盖静态。

 记住：
 重载：只看同名函数的参数列表。
 重写：子父类方法要一模一样。
 */
/*
3、子父类中的构造函数

在对子类对象进行初始化时，父类的构造函数也会运行，那是因为子类的构造函数默认第一行有一条隐式的语句super()；
super():会访问父类中空参数的构造函数。而且子类中所有的构造函数默认第一行都是super（）；


 为什么子类一定要访问父类中的构造函数。

 因为父类中的数据子类可以直接获取。所以子类对象在建立时，需要先查看父类时如何对这些数据进行初始化的。
 所以子类在对象初始化时，要先访问一下父类中的构造函数。
 如果要访问父类中的制定构造函数，可以通过手动定义super语句的方式来制定。

 注意：super语句一定定义在子类构造函数的第一行。

 子类的实例化过程
 结论：
 子类的所有构造函数，默认都会访问父类中空参数的构造函数。
 因为子类每一个构造函数的第一行都有一句隐式的super（）；

 当父类中没有空参数的构造函数时，子类必须手动通过super或者this语句形式来指定要访问的构造函数

 当然：子类的构造函数第一行也可以手动指定this语句来访问本类中的构造函数。子类中至少会有一个构造函数会访问父类中的构造函数。
 */
class Fu{// extends object所有类的上帝
//    private int num = 4;//私有以后就不能访问了
    /*int num = 4;
    public void show(){
        System.out.println("fu show");
    }
    void speak(){
        System.out.println("vb");
    }*/

    Fu(){
        System.out.println("fu run");
    }
}
class Zi extends Fu{
/*    void speak(){
        System.out.println("java");
    }
//    int num = 5;//如果省略掉该num那么num就是继承的类，那么用this访问和super的结果都是引用父类。
public void show(){
//        System.out.println(super.num);//父类的引用
//        System.out.println(this.num);//本类的引用
        System.out.println("zi show");
    }*/

    Zi(){
        //super()；调用父类引用，这里隐藏了super，因为是继承。
        //this（）；调用本类引用
        System.out.println("zi run");
    }
}

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Zi z = new Zi();//创建对象
//        System.out.println(z.num+"...."+z.num);//当子类和父类的变量相同时，继承子类。
//        z.show();
    }
}

class Tel{
    void show(){
        System.out.println("zi show");
    }
    void lingsheng(){

    }
}
/*
修改以前的代码最好不要修改源码，
可以继承原来的代码，然后定义新功能将原来代码覆盖掉（重写）。
 */
class NewTel extends Tel{
    void show(){
        System.out.println("number");
        System.out.println("name");
        System.out.println("pic");
    }

}

/*class Person{
    private String name;
    Person(String name){
        this.name = name;
    }
    void show(){}
}

class Student extends Person{
    Student(String name){
        super(name);
    }
    void method(){
        super.show();
    }
}*/
