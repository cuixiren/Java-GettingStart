package com.cuixr.oop.demo02;

/**
 * @author cuixr
 * @date 2022/7/21 22:12
 * @description
 */
// 学生类
public class Student {
    // 属性：字段
    String name;
    int age;

    // 方法
    public void study(){
        System.out.println(this.name + "学生在学习"); // this 代表当前这个类，this.name 则是当前类的name属性
    }

}
