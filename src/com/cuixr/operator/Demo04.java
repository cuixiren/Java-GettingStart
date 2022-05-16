package com.cuixr.operator;

public class Demo04 {
    public static void main(String[] args) {
        //++ -- 自增，自减 一元运算符
        int a = 3;

        int b = a++; //先给b赋值，a再自增
        //a = a+1
        System.out.println("a="+a);
        //a = a+1
        int c = ++a; //a先自增，再给c赋值

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

        //幂运算 2^3  2*2*2 = 8 很多运算我们会使用一些工具类来操作
        double pow = Math.pow(2,3);
        System.out.println(pow);
    }
}
