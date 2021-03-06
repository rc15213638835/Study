package lastyear;

/**
 * @program: Study
 * @Date: 2019/3/26 14:22
 * @Author: Mr.Ran
 * @Description:
 */
/*
final:最终。作为一个修饰符。
1、可以修饰类，函数，变量。
2、被final修饰的类不可以被继承。(注：继承的弊端：打破了封装性)
   为了避免被继承，被子类复写功能。
3、被final修饰的方法不可以被复写。
4、被final修饰的变量是一个常量，只能赋值一次，既可以修饰成员变量，又可以修饰局部变量。
   当在描述事物时，一些数据的出现值时固定的，那么这时为了增强阅读性，都给这些值取个名字，方便阅读。
   而这个值不需要改变，所以加上final修饰。作为常量：常量的书写规范所有字母都大写，如果由多个单词组成。
   单词间通过_链接。
5、内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量。

 */

/*class Demo {
    final void show1(){}//可以只定义该功能不能被复写
    void show2(){}
}*/
/*class SubDemo extends Demo{//不能继承，使用了final修饰的类

}*/
public class FinalDemo {
}
