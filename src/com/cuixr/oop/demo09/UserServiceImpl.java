package com.cuixr.oop.demo09;

/**
 * @author cuixr
 * @date 2022/7/28 21:21
 * @description
 */
// 实现类通过关键字 implements 对接口类实现
// 实现了接口的类，就需要重写接口中规范的方法
// 利用接口实现了多继承
public class UserServiceImpl implements UserService,TimeService{
    @Override
    public void add(String name) {
    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void timer() {

    }
}
