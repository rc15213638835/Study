/**
 * @program: Study
 * @Date: 2019/4/2 11:16
 * @Author: Mr.Ran
 * @Description:
 */
/*
异常:就是程序在运行时出现不正常情况。
异常由来:问题也是现实生活中一个具体的事物，也可以通过java的类的形式进行描述。并封装成对象
        其实就是java对不正常情况进行描述后的对象体现。

对于问题的划分:两种:一种是严重的问题，一种非严重的问题。

对于严重的，java通过Error类进行描述。

对于非严重的，java通过Exception类进行描述。
    对于Excpetion可以使用针对性处理方式进行处理。

无论Error或者Exception都具有一些共性的内容。
比如:不正常情况的信息，引发原因等。

Throwable
    ||--Error警告
    ||--Exception异常

2、异常的处理

try{
    需要被检测的代码;
}
catch(异常类 变量){
    处理异常代码;（处理方式）
}
finally{
    一定会执行的语句;
}

3、对捕获到的异常对象进行常见方法操作。
    String getMessage();获取异常信息

在函数上声明异常。
便于提高安全性，让调用出进行处理。不处理编译失败。

对多异常的处理。
1、声明异常时，建议声明和更为具体的异常。这样处理的可以更具体。
2、对方声明几个异常，就对应有几个catch块。不要定义多余的catch块。
    如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面。

建立在进行catch块处理时，catch中一定要定义具体处理方式。
不要简单定义一句e.printStackTrace(),
也不要简单的就书写一条输出语句。
 */
/*class Demo{
    int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException{//在功能上通过throws的关键字声明了该功能有可能会出现问题
                                                                                    //声明两个异常
        int[] arr = new int[a];

        System.out.println(arr[4]);//打印出数组中角标为4的元素。
        return a/b;
    }
}*/
public class ExcptionDemo {
    public static void main(String[] args){
        Demo d = new Demo();
        try {
            int x = d.div(4,1);
            System.out.println("x="+x);
        }
        catch (Exception e){
            System.out.println("haha："+e.toString());
        }
        /*catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("被零除了");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
            System.out.println("角标越界啦");
        }*/


        /*try {
           int x = d.div(4,1);
           System.out.println("x="+x);
        } catch (Exception e) {//Exception e = new ArithmeticException();
            System.out.println("除零啦");
            System.out.println(e.getMessage());//  /by zero
            System.out.println(e.toString());//异常名称:异常信息--更详细
            e.printStackTrace();//异常名称、异常信息、异常出现的位置
                                //其实JVM默认的异常处理了机制，就是在调用printStackTrace方法。
                                //打印异常的堆栈的跟踪信息。
        }*/

        System.out.println("over");


    }
}
