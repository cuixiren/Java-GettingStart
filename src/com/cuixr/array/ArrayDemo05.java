package com.cuixr.array;

import java.util.Arrays;

/**
 * @author cuixr
 * @date 2022/7/17 15:28
 * @description 冒泡排序
 */
public class ArrayDemo05 {

    public static void main(String[] args) {
//        int[] a = {1, 5161, 11, 2457, 1346, 1846, 32, 466, 55};
        int[] a = {5161, 2457, 1846, 1346, 466, 55, 32, 11, 1};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }

    //冒泡排序
    //1.比较数组中,两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置
    //2.每一次比较，都会产生出一个最大，或者最小的数字;
    //3.下一轮则可以少一次排序!
    //4.依次循环，直到结束!
    public static int[] sort(int[] array) {
        //临时变量
        int temp = 0;

        // 外层循环判断走多少次
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false; //通过flag标识减少没有意义的比较.
            // 内层循环比较两个数，每次把最大的数排到最左侧
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 内层循环比大小，因为外层循环了 i 次所以确定了 i 个数，所以循环次数为 array.length - 1 - i
                if (array[j] < array[j + 1]) {
                    // 通过中间杯子交换两个数
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp; // 相邻两个数组元素交换完毕
                    flag = true;
                }
            }

            //如果第一次就是有序，比一次直接结束了，不用全部比一遍（不会进入下一次i循环）
            //只要是已经排序好了的数组就绝不会跑到flag==true，相反若是有一丁点乱序，那么就使flag==true
            if (flag==false){
                break;
            }
        }
        return array;
    }

}
