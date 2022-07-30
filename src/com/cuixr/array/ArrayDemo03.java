package com.cuixr.array;

/**
 * @author cuixr
 * @date 2022/7/15 23:10
 * @description
 */
public class ArrayDemo03 {

    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};
        // JDK1.5开始支持，不用下标使用迭代器遍历数组,和Python一样适合打印但不适合下标操作
        printArray(reverseArray(arrays));
    }
    // 打印数组
    public static void printArray(int[] arrays){
        for(int array:arrays){
            System.out.println(array);
        }
    }
    // 翻转打印数组
    public static int[] reverseArray(int[] arrays){
        int[] reverse = new int[arrays.length]; // 新建同样大小数组用于接收原数据
        // 进行元素收尾对调
        for (int i = 0; i < arrays.length; i++) {
            reverse[arrays.length-i-1] = arrays[i]; //即大小为5的话，r[4]=a[0]，记住-1
        }
        return reverse;
    }

}
