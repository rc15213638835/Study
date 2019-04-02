/**
 * @program: Study
 * @Date: 2019/4/1 17:26
 * @Author: Mr.Ran
 * @Description:
 */
interface Inter{
    void method();
}
class Test{
    //不足代码。通过过匿名内部类。
    /*static  class Inner implements Inter{
        public void method(){
            System.out.println("method run");
        }
    }*/
    static Inter function(){
        return new Inter(){
            public void method(){
                System.out.println("method run");
            }
        };
    }
}
class InnerClassTest {
    public static void main(String[] args) {
        //Test.function();Test类中有一个静态的方法function。
        //.method():function这个方法运算后的结果是一个对象。而且是一个Inter类型的对象。
        //因为只有是Inter类型的对象，才可以调用method方法。
        Test.function().method();

//        Inter in = Test.function();
//        in.method();
        show(new Inter() {
            @Override
            public void method() {
                System.out.println("method show run");
            }
        });
    }
    public static void show(Inter in){
        in.method();
    }
}
class InnerTest{

    public static void main(String[] args) {
        new Object(){//Object的子类对象
            public void function(){

            }
        }.function();
    }
}


