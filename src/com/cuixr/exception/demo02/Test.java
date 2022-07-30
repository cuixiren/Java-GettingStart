package com.cuixr.exception.demo02;

/**
 * @author cuixr
 * @date 2022/7/30 12:36
 * @description
 */
public class Test {

    // 可能会存在异常的方法
    static void test(int a) throws MyException {
        System.out.println("传递的参数为：" + a);

        if( a > 10){
            throw new MyException(a); // 主动抛出异常，一般在方法中使用
        }
        System.out.println("OK");
    }

    public static void main(String[] args) {
        try { // 捕获异常
            test(11);
        } catch (MyException e) {
            System.out.println("MyException:" + e);;
        }
    }
}
