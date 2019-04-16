/**
 * @program: Study
 * @Date: 2019/4/16 16:05
 * @Author: Mr.Ran
 * @Description:
 */
package pack;

import packa.DemoA;

/*
总结:
    包与包之间进行访问，被访问的包中的类以及类中的成员，需要public修饰。
    不同包中的子类还可以直接访问父类中被protected权限修饰的成员。

包与包之间可以使用的权限只有两种，public protected


            public      protected       default     private
同一个类中       OK          OK              OK          OK
同一个包中       OK          OK              OK
子类            OK          OK
不同包中         OK
 */
public class PackageDemo {
    public static void main(String[] args) {
//        DemoA d = new DemoA();
//        d.show();
        DemoA d = new DemoA();
        d.show();

    }
}
