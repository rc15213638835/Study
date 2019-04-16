package lastyear;

/**
 * @program: Study
 * @Date: 2019/3/26 16:21
 * @Author: Mr.Ran
 * @Description:
 */

/*假如我们在开发一个系统时需要对员工进行建模，员工包含3个属性：
姓名、工号以及工资。经理也是员工，除了含有员工的属性外，另外还有一个奖金属性。请使用
继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。

员工类：name、id、pay
经理类：继承了员工，并有自己特有的奖金属性（bonus）。
 */

/*
抽象类的特点：
1、抽象方法一定定义在抽象类中。
2、抽象方法和抽象类都必须被abstract关键字修饰。
3、抽象类不可以用new创建对象。因为调用抽象方法没意义。
4、抽象类中的方法要被使用，必须由子类复写其所有的抽象方法后，建立子类对象调用。
   如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。
 */
abstract class Employee{//抽象方法一定定义在抽象类中。
    private String name;
    private String id;
    private double pay;

    Employee(String name,String id,double pay){
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    public abstract void work();
}
class Manager extends Employee{
    private int bonus;
    Manager(String name,String id,double pay,int bonus){
        super(name,id,pay);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("manager work");
    }
}

class Pro extends Employee{
    Pro(String name,String id,double pay){
        super(name,id,pay);
    }
    public void work(){
        System.out.println("pro work");
    }
}

public class AbstractTest {
    public static void main(String[] args) {

    }
}
