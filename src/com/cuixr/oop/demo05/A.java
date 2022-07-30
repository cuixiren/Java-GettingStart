package com.cuixr.oop.demo05;

/**
 * @author cuixr
 * @date 2022/7/27 21:42
 * @description
 */
public class A extends B{

    //子类重写父类可以将父类方法范围扩大，但不能缩小
    @Override
    public void test(){
        System.out.println("A=>test()");
    }
}
