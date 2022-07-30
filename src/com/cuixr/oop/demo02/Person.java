package com.cuixr.oop.demo02;

/**
 * @author cuixr
 * @date 2022/7/21 22:16
 * @description
 */
public class Person {
    String name;

    // 显示定义无参构造方法
    public Person(){
        this.name = "Marine"; // 显示赋初始值为 Marine
    }
    // 有参构造方法：一旦定义了有参构造，无参构造就必须显示定义，否则就无效
    // 定义有参构造器，它会覆盖无参构造器，如果你想要它还存在，那么就自己定义出来
    public Person(String name){
        this.name = name; // this.name 的name是对象的属性，而 String name 的name是形参
    }
}
