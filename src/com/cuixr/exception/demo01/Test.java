package com.cuixr.exception.demo01;

/**
 * @author cuixr
 * @date 2022/7/30 12:18
 * @description
 */
public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // 类似 if else 结构如果 try 代码块内发生 catch() 内的异常就执行 catch 代码块
        try { // try 代码块必须；把可能有异常的代码放进去进行监控
            System.out.println(a / b);
        } catch (ArithmeticException e) {// catch 代码块必须；针对可能的异常进行处理（）里是想要捕获的类型
            System.out.println("程序出现异常，变量b不能为0");
        } finally {// finally 代码块非必须；处理善后工作如资源归还关闭服务等，不论有没有出现异常都会执行
            System.out.println("finally");
        }
    }
}
