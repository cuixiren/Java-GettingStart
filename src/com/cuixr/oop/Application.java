package com.cuixr.oop;

import com.cuixr.oop.demo06.Person;
import com.cuixr.oop.demo06.Student;
import com.cuixr.oop.demo10.Outer;

/**
 * @author cuixr
 * @date 2022/7/26 22:30
 * @description
 */
// 一个项目应该只有一个 main 方法
public class Application {

//    // 静态方法和非静态方法区别很大！
//    // 静态方法的调用只和左边定义的数据类型有关
//    // 静态方法只能被继承，不能被重写
//    public static void main(String[] args) {
////        Student student = new Student();
////        student.test("cuixiren");
////        student.testPrint();
//
//        //即b是A new出来的对象，因此调用了A的方法
//        //因为静态方法是类的方法，而非静态是对象的方法
//        //有static时，b调用了B类的方法，因为b是用b类定义的
//        //没有static时，b调用的是对象的方法，而b是用A类new的
//        A a = new A(); // a 的数据类型是 A
//        a.test();
//        // 父类的引用可以指向子类
//        B b = new A(); // b 的数据类型是 B
////        b.test();
//    }

//    public static void main(String[] args) {
//        // 一个对象的实际类型是确定的，但是指向它的引用类型就不确定了：父类的引用指向子类
//        // Student 能调用的方法都是自己的或者继承父类的！
//        Student s1 = new Student();
//        // Person 属于是父类引用指向了子类，但是不能调用子类独有的方法
//        Person s2 = new Student(); // 有继承关系的才行
//        Object s3 = new Student();
//
//        // 对象能执行哪些方法，主要看对象左边的类型，和右边关系不大
//        s2.run(); //子类重写了父类的方法，调用子类的方法
//        s1.run();
//        s1.eat();
//
//        ((Student) s2).eat(); // 执行子类的方法必须强制转换类型
//    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        // 通过外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.getID();
    }

}
