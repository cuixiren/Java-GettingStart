package com.cuixr.oop.demo09;

/**
 * @author cuixr
 * @date 2022/7/28 21:18
 * @description
 */
// 接口定义需要的是抽象思维——Java架构师
// interface 关键字定义接口，接口都需要有实现类
public interface UserService {
    // 接口中定义的所有属性都是常量 public final,一般不会这么做
    int AGE = 20;
    // 接口中定义的所有方法都是默认抽象的 public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
