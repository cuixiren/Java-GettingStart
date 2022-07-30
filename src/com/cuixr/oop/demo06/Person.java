package com.cuixr.oop.demo06;

/**
 * @author cuixr
 * @date 2022/7/27 22:04
 * @description
 */
public class Person {

    public void run(){}
}

//多态的注意事项：
//1.多态是方法的多态，属性没有多态
//2.父类和子类因为有联系才有多态，否则就是类型转换异常 ClassCastException！
//3.存在的条件：有继承关系，且方法需要重写，父类引用指向子类对象 Father f1 = new Son();
