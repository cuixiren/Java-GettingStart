package com.cuixr.exception.demo01;

/**
 * @author cuixr
 * @date 2022/7/30 12:24
 * @description
 */
public class Test2 {

    public static void main(String[] args) {
//        int a = 1;
//        int b = 0;
//        // 选中代码 CRTL + ALT + T 可以快捷键编写try catch代码
//        // 捕获结构类似 if else 结构可以叠加，从上至下范围越来越大
//        try{
//            System.out.println(a/b);
//        }catch (Error e){
//            System.out.println("Error");
//        }catch(Exception e){
//            System.out.println("Exception");
//        }catch(Throwable t){
//            System.out.println("Throwable");
//        }
//        finally {
//            System.out.println("finally");
//        }

        new Test2().test(1,0); // 哪怕方法中没有定义除法运算也会抛出异常
    }

    // 假设这个方法中，处理不了这个异常，方法上抛出异常
    public void test(int a, int b) throws ArithmeticException{
        if( b == 0){ // throw 与 throws 不同
            throw new ArithmeticException(); // 主动抛出异常，一般在方法中使用
        }
    }

}
