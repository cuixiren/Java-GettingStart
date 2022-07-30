package com.cuixr.oop.demo01;

/**
 * @author cuixr
 * @date 2022/7/21 22:05
 * @description
 */
//引用传递：对象，本质还是值传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person(); // 实例化
        System.out.println(person.name);

        Demo05.changeName(person);
        System.out.println(person.name);
    }
    public static void changeName(Person a){
        a.name = "崔喜人";
    }
}

class Person{
    String name; // 默认是null
}
