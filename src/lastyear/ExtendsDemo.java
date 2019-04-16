package lastyear;

/**
 * @program: Study
 * @Date: 2019/3/25 15:12
 * @Author: Mr.Ran
 * @Description:
 */
/*将学生和工人的共性描述提取出来，单独进行描述
只要让学生和工人与单独描述的这个类有关系就可以了。

继承：
1、提高代码的复用性。
2、让类与类之间产生了关系。有了这个关系，才有了多态的特性。

注意：千万不要为了获取其他类的功能，简化代码而继承；
     必须是类与类之间有所属关系才可以继承。所属关系 is a。
class C{
    void demo1(){}
}

class A{
//    void demo1(){}
    void demo2(){}
}

class B extends A{
//    void demo1(){}
    void demo3(){}
}

JAVA语言中：java只支持单继承，不支持多继承。
因为多继承容易带来安全隐患:当多个父类中定义了相同的功能，当功能内容不同时，子类对象不确定要运行哪一个。
但是java保留这种机制。并用另一种体现形式来完成表示。多实现。

java支持多层继承。也就是一个继承体系

如何使用一个继承体系中的功能呢？

想要使用体，先查阅体系父类的描述，
因为父类中定义的是该体系中共性功能，通过了解共性功能，就可以知道该体系的基本功能。
那么这个体系已经基本可以使用了。
那么在具体调用时，要创建最子类的对象，为什么呢？
一是因为父类不能创建对象。二是创建子类对象可以使用更多功能，包括基本的也包括特有的。
简单一句话：查阅父类功能，创建子类对象的使用功能。

class A{
    void show(){
    System.out.println("a");
    }
}
class B{
    void show(){
    System.out.println("b");
    }
}

class C extends A,B{}
C c = new C();
c.show();
*/

class Person{
    String name;//共性的描述：name、age
    int age;
}
/*class Student extends Person{

    void study(){
        System.out.println("good study");
    }
}*/

class Worker extends Person{
    void work(){
        System.out.println("good work");
    }
}


/*public class ExtendsDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "zhangsan";
    }
}*/
