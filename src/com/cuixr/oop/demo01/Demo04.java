package com.cuixr.oop.demo01;

/**
 * @author cuixr
 * @date 2022/7/21 22:03
 * @description
 */
//值传递
public class Demo04 {
    public static void main(String[] args) {
        int a = 1; // 与change方法内 int a 同名不同名，实际是两个内存地址
        System.out.println(a);

        Demo04.change(a);
        System.out.println(a);
    }
    // 返回值为空，仅进行方法体
    public static void change(int a) {
        a = 10; // 作用域有限，仅在方法内有效,方法结束后就被释放了
    }
}
