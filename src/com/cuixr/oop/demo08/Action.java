package com.cuixr.oop.demo08;

/**
 * @author cuixr
 * @date 2022/7/28 21:03
 * @description
 */

// 抽象类；子类 extends 只能单继承，只有接口可以多继承
// 图纸
public abstract class Action {

    // 只是一个声明，没有方法体；一种约束，子类帮忙实现
    // abstract抽象方法，只有方法名字，没有方法的实现！
    public abstract void doSomething();
    // 1.不能new这个抽象类，只能靠子类去实现它
    // 2.抽象类中可以写普通方法
    // 3.抽象方法必须在抽象类中
    // 优点：抽象出来，提高开发效率
}

