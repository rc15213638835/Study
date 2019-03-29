/**
 * @program: Study
 * @Date: 2019/3/27 16:30
 * @Author: Mr.Ran
 * @Description:
 */

/*
需求：
电脑运行实例，
电脑运行基于主板。
 */
interface PCI{
    public void open();
    public void close();
}
class MainBoard{
    public void run(){
        System.out.println("mainboard run");
    }
    public void usePCI(PCI p){//PCI p = new NetCard()//接口型指向自己的子类对象。
        if (p!=null){
            p.open();
            p.close();
        }
    }
}

class NetCard implements PCI{
    public void open(){
        System.out.println("newtcar open");
    }
    public void close(){
        System.out.println("newtcar close");
    }
}
class SoundCard implements PCI{
    public void open(){
        System.out.println("newtcar open");
    }
    public void close(){
        System.out.println("newtcar close");
    }
}

/*class MainBoard{
    public void run(){
        System.out.println("mainboard run");//主板
    }
    public void useNetCard(NetCard c){
        c.open();
        c.close();
    }
}
class NetCard{
    public void open(){
        System.out.println("newtcar open");
    }
    public void close(){
        System.out.println("newtcar close");
    }
}*/

public class DuoTaiDemo5 {
    public static void main(String[] args) {
        MainBoard mb = new MainBoard();
        mb.run();
        mb.usePCI(null);
        mb.usePCI(new NetCard());
//        mb.run();
//        mb.useNetCard(new NetCard());
    }
}
