package com.cuixr.exception.demo02;

/**
 * @author cuixr
 * @date 2022/7/30 12:32
 * @description
 */
// 自定义的异常类
public class MyException extends Exception{

    // 传递数字 > 10;
    private int detail;

    public MyException(int a){
        this.detail = a;
    }

    // toString:异常的打印信息
    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
