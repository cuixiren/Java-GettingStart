package com.cuixr.oop.demo10;

/**
 * @author cuixr
 * @date 2022/7/28 21:47
 * @description
 */
// 外部类
public class Outer {

    private int ID = 10;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    //局部内部类
    public void method(){
        class Inner{
            public void in(){}
        }
    }

    public class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }
        // 可以获得外部类的私有属性和方法
        public void getID(){
            System.out.println(ID);
        }
    }
}

//一个Java类文件中可以有多个class，但是只能有一个public class
//这样就可以在一个文件内测试了
class A{
    public static void main(String[] args) {

    }
}
