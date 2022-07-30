package com.cuixr.oop.demo02;

/**
 * @author cuixr
 * @date 2022/7/21 22:12
 * @description
 */
//一个项目应该只存在一个main方法
public class Application {
//    public static void main(String[] args) {
//        // 类是抽象的，需要实例化一个个体
//        // 类实例化后会返回一个自己类的对象
//        Student Jack = new Student(); // 这里的 Student() 其实就是学生类的一个同名构造函数，系统自动生成
//        Student Brand = new Student();
//        Jack.age = 15;
//        Jack.name = "Jack";
//        Brand.name = "Brand";
//        Brand.age = 16;
//        System.out.println(Jack.name+"今年"+Jack.age+"岁");
//        System.out.println(Brand.name+"今年"+Brand.age+"岁");
//    }

    public static void main(String[] args) {
        // 类是抽象的，需要实例化一个个体
        // 1.使用 new 关键字时，本质是调用构造器
        // 2.初始化值
        Person person = new Person();
        System.out.println(person.name); // 此时优先调用用户定义的显示构造方法
    }

}
