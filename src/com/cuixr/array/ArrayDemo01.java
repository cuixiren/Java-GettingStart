package com.cuixr.array;

/**
 * @author cuixr
 * @date 2022/7/15 23:10
 * @description
 */
public class ArrayDemo01 {

    public static void main(String[] args) {
        int[] numbers; // 1.声明一个数组，在栈区新建一个“指针”，但没有初始化为随机值，准备指向数组的内存地址
        numbers = new int[5]; // 2.创建数组，用 new 给数组在堆区分配了5个 int 的空间，并把地址给到前面的“指针”

        numbers[0] = 5; // 3.声明后只能通过下标给数组元素赋值，相当于直接对堆区的每一个 int 空间进行赋值操作
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;
        numbers[4] = 30;

        System.out.println(numbers[0]);
    }

}
