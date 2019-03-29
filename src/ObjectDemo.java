/**
 * @program: Study
 * @Date: 2019/3/28 10:45
 * @Author: Mr.Ran
 * @Description:
 */
/*
Object:是所有对象的直接或者间接父类，传说中的上帝

该类中定义的肯定是所有对象都具备的功能。

Object类中已经提供了对对象是否相同的比较方法。
如果自定义类中也有比较相同的功能，没有必要重新定义。
只要沿袭父类中的功能，建立自己特有比较内容即可。这就是覆盖。
 */
class Demo{//extends Object
    private int num;
    Demo(int num){
        this.num = num;
    }
    public boolean equals(Object obj){//Object obj  = new Demo();

        Demo d = (Demo)obj;
        return this.num == d.num;
    }
}
    /*public boolean compare(Demo d){
        return this.num==d.num;
    }*/
class Persin{

}
/*public class ObjectDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo(4);
        class c = d1.getClass();
//        Demo d2 = new Demo(4);
        System.out.println(d1.toString());
        System.out.println(c.getName());
//        Person p = new Person();
//        System.out.println(d1.equals(p));
//        Demo d3 = d1;
//        System.out.println(d1.equals(d3));
//        System.out.println(d1==d2);
//        System.out.println(d1==d3);//其实比较的是地址

//        Person p1 =new Person();
//        Person p2 =new Person();
//        System.out.println("person:"+p1.equals(p2));
//        System.out.println(d1.compare(d2));
    }
}*/
