package com.cuixr.oop.demo01;

/**
 * @author cuixr
 * @date 2022/7/21 21:55
 * @description
 */
public class Demo02 {
    public static void main(String[] args) {
        Student.say(); // 在静态方法调用时直接用类方法就可以进行调用
    }

//    //和类一起加载的
//    public static void a(){
//        b();
//    }
//
//    //类实例化之后才存在
//    public void b(){
//    }
}
