package com.cuixr.oop.demo01;

/**
 * @author cuixr
 * @date 2022/7/21 22:00
 * @description
 */
public class Demo03 {

    public static void main(String[] args) {
        //实际参数和形式参数的类型要对应
        int add = Demo03.add(1,2);
        System.out.println(add);
    }
    // 返回值为空，仅进行方法体
    public static int add(int a,int b) {
        return a+b;
    }

}
