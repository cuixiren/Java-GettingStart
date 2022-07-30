package com.cuixr.array;

/**
 * @author cuixr
 * @date 2022/7/15 23:10
 * @description
 */
public class ArrayDemo02 {

    public static void main(String[] args) {
//        // 静态初始化：创建 + 赋值
//        int[] a = {1, 2, 3};
//        System.out.println(a[2]);
//
//        // 动态初始化：包含默认初始化
//        int[] b = new int[10]; // 此时数组元素均为0
//        b[0] = 10;
//        System.out.println(b[0]);
//        System.out.println(b[1]); // 默认初始化为0

        int[] arrays = {1, 2, 3, 4, 5};
        // 遍历打印全部数组元素
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println("===============");
        // 计算所有元素的和
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println("数组元素和为："+sum);
        System.out.println("===============");
        // 查找最大元素
        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] > max){
                max = arrays[i];
            }
        }
    }

}
