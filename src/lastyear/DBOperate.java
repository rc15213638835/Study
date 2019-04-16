/**
 * @program: Study
 * @Date: 2019/3/28 10:02
 * @Author: Mr.Ran
 * @Description:
 */
/*
需求：数据库的操作。
数据是：用户信息。
1、链接数据库。 JDBC Hibernate
2、操作数据库
    c creat r read u update d delet
3、关闭数据库链接
 */

/*
interface UserInfoDao{
    public void add(User user);
    public void delet(User user);
}

public class DBOperate {
//    UserfoByJDBC ui = new UserfoByJDBC();
//    UserInfoByHibernate ui = new UserInfoByHibernate();
    UserInfoDao ui = new UserInfoByHibernate();
    ui.add(user);
    ui.delete(user);
}

class UserfoByJDBC implements UserInfoDao{
    public void add(User user){
        1、链接数据库。
        2、使用sql添加语句添加数据。
        3、关闭链接。
    }
    public void delet(User user){
        1、链接数据库。
        2、使用sql删除语句添加数据。
        3、关闭链接。
    }
}

class UserInfoByHibernate implements UserInfoDao{
    public void add(User user){
        1、链接数据库。
        2、使用sql添加语句添加数据。
        3、关闭链接。
    }
    public void delet(User user){
        1、链接数据库。
        2、使用sql删除语句添加数据。
        3、关闭链接。
    }
}*/
