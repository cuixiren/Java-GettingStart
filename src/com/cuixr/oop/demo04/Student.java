package com.cuixr.oop.demo04;

/**
 * @author cuixr
 * @date 2022/7/26 22:29
 * @description
 */
//好处：1.提高程序的安全性，保护数据 2.隐藏代码的实现细节 3.统一接口 4.系统可维护性
public class Student {
    // 私有属性
    private String name; // 姓名
    private int ID; // 学号
    private int age; // 年龄
    private char sex; // 性别

    // 提供外部能使用的方法
    // get获得这个数据
    public String getName(){
        return this.name;
    }
    // set设置这个数据
    public void setName(String name){
        this.name = name;
    }
}
