package com.cuixr.oop.demo05;

/**
 * @author cuixr
 * @date 2022/7/26 22:40
 * @description
 */
// 学生 is 人：派生类，子类
// 子类继承了父类，就会拥有父类的全部方法和属性
public class Student extends Person{

    public Student() {
        //隐藏代码：调用了父类的无参构造
        super(); //调用了父类的无参构造,必须在子类构造器的第一行
        System.out.println("Student无参构造执行了");
    }

    protected String name = "学生";

    public void print(){
        System.out.println("Student");
    }

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void testPrint(){
        print();
        this.print();
        super.print();
    }
}
