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

 */
class Demo{
    int div(int a,int b){
        return a/b;
    }
}
public class ExcptionDemo {
    public static void main(String[] args) {
//        Demo d = new Demo();
//        int x = d.div(4,0);
//        System.out.println("x="+x);
//        System.out.println("over");

    }
}
