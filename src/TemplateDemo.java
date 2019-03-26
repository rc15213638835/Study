/**
 * @program: Study
 * @Date: 2019/3/26 16:44
 * @Author: Mr.Ran
 * @Description:
 */

/*
需求：获取一段程序的运行时间。
原理：获取程序开始和结束的时间并相减即可。

获取时间：System.currentTimeMillis();

当代码完成优化后，就可以解决这类问题。

这种方式，模板方法设计模式。

什么是模板方法呢？
在定义功能时，功能的一部分是确定的，但是又一部分是不确定，而确定的部分在使用不确定的部分。
那么这时就将不确定的部分暴露出去。由该类的子类去完成。
 */

class GetTime{//获取时间
    public void getTime(){//定义方法
        long start = System.currentTimeMillis();//System.currentTimeMillis()获取开始时间

        runcode();

        long end = System.currentTimeMillis();//System.currentTimeMillis()获取结束时间

        System.out.println("毫秒:"+(end-start));
    }

    public void runcode(){
        for (int x=0;x<1000;x++){//定义一个函数测试
            System.out.println(x);
        }
    }
}
/*
自己使用不建议改代码，建议复写。
 */
class SubTime extends GetTime{
    public void runcode(){//定义方法
//        long start = System.currentTimeMillis();//System.currentTimeMillis()获取开始时间
        for (int x=0;x<4000;x++){//定义一个函数测试
            System.out.println(x);
        }

//        long end = System.currentTimeMillis();//System.currentTimeMillis()获取结束时间

//        System.out.println("毫秒:"+(end-start));
    }
}

public class TemplateDemo {
    public static void main(String[] args) {
        SubTime st = new SubTime();
        st.getTime();

    }
}
