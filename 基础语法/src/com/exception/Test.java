package com.exception;

import sun.awt.windows.ThemeReader;
// 捕获多个一场，从小到大
public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try{
            System.out.println(a/b);
//            new Test().a();
        }catch (Exception e){
            System.out.println("exception");
        }catch(Throwable e){
            System.out.println("error");
        }finally {
            System.out.println("finally");
        }
    }

    public void a(){
        b();
    }

    public void b(){
        a();
    }
}
