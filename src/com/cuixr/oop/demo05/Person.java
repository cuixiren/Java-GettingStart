package com.cuixr.oop.demo05;

/**
 * @author cuixr
 * @date 2022/7/26 22:40
 * @description
 */
public class Person {
    public Person() {
        System.out.println("Person无参构造执行了");
    }

    protected String name = "人";

    //私有的东西无法被继承
    public void print(){
        System.out.println("Person");
    }
}
