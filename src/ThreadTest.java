/**
 * @program: Study
 * @Date: 2019/4/17 10:51
 * @Author: Mr.Ran
 * @Description:
 */
/*
练习：
创建两个线程，和主线程交替运行。

原来有现成都有自己默认的名称。
Thread-编号 该编号从0开始。
 */
class Test extends Thread{
    private String name;
    Test(String name){
//        this.name = name;
        super(name);
    }
    public void run(){
        for (int x=0;x<60;x++){
            System.out.println((Thread.currentThread()==this)+"..."+this.getName()+" run..."+x);
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        Test t1 = new Test("one");
        Test t2 = new Test("two");
        t1.start();
        t2.start();
//        t1.run();
//        t2.run();
        for (int x=0;x<60;x++){
            System.out.println("main..."+x);
        }
    }
}
