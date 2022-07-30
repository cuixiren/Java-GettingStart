package com.cuixr.array;

import java.util.Arrays;

/**
 * @author cuixr
 * @date 2022/7/16 0:06
 * @description
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] array = {25, 333, 254, 64, 128};
        // 打印数组元素
        System.out.println(array); // [I@49e4cb85
        // 打印数组元素 Arrays.toString
        System.out.println(Arrays.toString(array));
        // 升序排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 20);// 使用20来填充每一个数组元素
        System.out.println(Arrays.toString(array));
    }
}
