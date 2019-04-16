package lastyear;

/**
 * @program: Study
 * @Date: 2019/4/15 15:30
 * @Author: Mr.Ran
 * @Description:
 */

/*
Exception中有一个特殊的子类异常RuntiomeException运行时异常。

如果在函数内容抛出该异常，函数上可以不用声明，编译一样通过。

如果在函数上声明了该异常。调用者可以不用进行处理。编译一样通过。

之所以不用再函数声明，是因为不需要让调用者处理。
当该异常发生，希望程序停止。因为再运行时，出现了无法继续运算的情况，希望停止程序后，
对代码进行修正。


自定义异常时：如果该异常的发生，无法再继续进行运算，
就让自定义异常继承RuntimeException。


对于异常分两种：
1、编译时被检测的异常
2、编译时不被检测的异常（运行时异常：RuntimeException以及其子类）
 */

class FushuException extends RuntimeException{
    FushuException(String msg){
        super(msg);
    }
}
/*class Demo{
    int div(int a,int b)throws FushuException{
        if (b<0)
            throw new FushuException("出现了除数为负数了");
//        if (b==0)
//            throw new ArithmeticException("被零除啦");//函数内抛，函数外要标识。
        return a/b;
    }
}*/
/*public class ExceptionDemo5 {
    public static void main(String[] args) {
        Demo d = new Demo();
//
//        int x = d.div(4,2);
//        System.out.println("x="+x);
//
//        System.out.println("over");
        try {
            int x =d.div(4,-1);
            System.out.println("x="+x);
        } catch (FushuException e) {
            System.out.println(e.toString());
            return;//结束该主函数，over就不会执行了。finall一定会执行
            System.exit(0);//系统，推出。JVM结束。
        }
        finally {
            System.out.println("finally");//finally中存放的是一定会被执行的代码
        }
        System.out.println("over");

    }
}*/


/*
    finally代码块：定义一定执行的代码。
    通常用于关闭资源。（非常重要，不关闭容易造成资源浪费。）


 */
/*public void method()throws NoException {
    连接数据库;

    数据库操作;//throw new SQLException();

    关闭数据库;//该动作，无论数据操作是否成功，一定要关闭资源。
    try {
        连接数据库;

        数据操作;//throw new SQLException()；
    }
    catch (SQLException e){
        会对数据库进行异常处理;
        throw new NoException();
    }
    finally {
        关闭数据库;
    }
}*/






/*
class Person{
    public void checkName(String name){
        if(name.equals("lisi"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
main(){
    Person p =new Person();
    p.checkName(null);
}*/
