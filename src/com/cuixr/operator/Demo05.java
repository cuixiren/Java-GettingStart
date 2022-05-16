package com.cuixr.operator;

//逻辑运算符
public class Demo05 {
    public static void main(String[] args) {
        //与（and）  或（or）  非（取反）
        boolean a = true;
        boolean b = false;

        System.out.println("a && b:"+(b&&a)); //两个变量都为真，结果才为true
        System.out.println("a || b:"+(b||a)); //两个变量有一个为真，结果就为true
        System.out.println("!(a && b)"+!(b&&a)); //取反

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);//因为前一条件为假，&&后的代码根本没执行
        System.out.println(d);
        System.out.println(c);
    }
}
