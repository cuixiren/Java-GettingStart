package com.cuixr.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收：");

        //判断是否还有输入
        if (scanner.hasNextLine()){
            //next一定要输入有效字符才能结束输入，不能得到空格
            //nextLine返回回车之前的所有字符，可以获得空白
            String str = scanner.nextLine();
            System.out.println("输出的内容为："+str);
        }

        //凡是属于IO流的类，如果不关闭会一直占用资源，要养成好习惯用完就关掉
        scanner.close();
    }
}
