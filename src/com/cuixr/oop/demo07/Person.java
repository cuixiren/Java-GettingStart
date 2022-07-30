package com.cuixr.oop.demo07;

/**
 * @author cuixr
 * @date 2022/7/28 20:56
 * @description
 */
public class Person {

    {
        // 匿名代码块，第二个执行，可以赋一些初始值
        System.out.println("匿名代码块");
    }
    static{
        // 静态代码块，第一个执行，但只执行一次
        System.out.println("静态代码块");
    }

    public Person() {
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        Person person = new Person(); // 第三个执行
        System.out.println("====================");
        Person person2 = new Person();
    }

}
