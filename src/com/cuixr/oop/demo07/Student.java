package com.cuixr.oop.demo07;

/**
 * @author cuixr
 * @date 2022/7/28 20:49
 * @description
 */
public class Student {
    // 静态属性
    private static int age; // 静态变量
    private double score; // 普通变量

    // 静态方法
    // 在同一个类中，普通方法可以调用静态方法，反之则不行，这是加载顺序决定的
    public void run(){
        System.out.println("run");
        go();
    }

    public static void go(){
        System.out.println("go");
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.score); // 普通变量只能通过实例访问
        System.out.println(student.age);

        System.out.println(Student.age); // 静态变量可以通过类访问
    }

}
