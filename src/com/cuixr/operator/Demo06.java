package com.cuixr.operator;

public class Demo06 {
    public static void main(String[] args) {
        /*
        1为true，0为false带进去思考
        A = 0011 1100
        B = 0000 1101
        ---------------------
        A&B = 0000 1100  与，如果两个都是1则为1，否则为0
        A|B = 0011 1101  或，如果两个都是0则为0，否则为1
        A^B = 0011 0001  异或，相同为0，不同为1
        ~B = 1111 0010  取反

        2*8 = 16 2*2*2
        效率极高
        <<  *2
        >>  /2

        0000 0000  0
        0000 0001  1
        0000 0010  2
        0000 0011  3
        0000 0100  4
        0000 1000  8
        0001 0000  16
         */
        System.out.println(2<<3);
    }
}
