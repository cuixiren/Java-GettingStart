package com.cuixr.array;

/**
 * @author cuixr
 * @date 2022/7/17 16:21
 * @description 稀疏数组
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        // 1.创建一个二维数组 11*11 0：没有棋子  1：黑棋  2：白棋
        int[][] array = new int[11][11]; // 新建二维数组，默认值为0
        array[1][2] = 1;
        array[2][3] = 2;
        // 输出原始数组
        System.out.println("输出原始数组：");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();// 打印一行后换行
        }
        System.out.println("=========================================");
        // 转换为稀疏数组保存，先获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(array[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("有效值的个数：" + sum);

        // 创建一个稀疏数组
        int[][] xishuArray = new int[sum+1][3];
        xishuArray[0][0] = 11;// 表头几行几列几个有效值
        xishuArray[0][1] = 11;
        xishuArray[0][2] = sum;
        // 遍历二维数组，将非 0 值存放在稀疏数组
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] != 0){
                    count++; // 计数加换行的作用
                    xishuArray[count][0] = i; // 先存行号
                    xishuArray[count][1] = j; // 再存列号
                    xishuArray[count][2] = array[i][j]; // 再存值大小
                }
            }
        }
        System.out.println("输出稀疏数组：");
        for (int[] ints : xishuArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();// 打印一行后换行
        }

        //输出还原的数组
        int[][] revertArray = new int[xishuArray[0][0]][xishuArray[0][1]];

        //i=0会报数组下标越界，因为revertArray只能取到revertArray[10][10],取不到revertArray[11][11]
        for (int i = 1; i < xishuArray.length; i++) {
            revertArray[xishuArray[i][0]][xishuArray[i][1]] = xishuArray[i][2];
        }

        System.out.println("输出还原的数组：");
        for (int[] ints : revertArray) {
            //打印每一行
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();// 打印一行后换行
        }

    }
}
