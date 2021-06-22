package com.oop.Demo09;

// interface 定义接口的关键字
// 抽象的思维
public interface UserService {
    // 接口中的所有定义其实都是抽象的 public
    public void run();
    public abstract void go();

    //返回值类型  方法名（参数）

    void add();
    void delelte();
    void update();
    void query();

}
