package com.angyi.www.base;

public class Test2 {
    public static void main(String[] args) {
        // （1） 已基本数据类型作为参数 调用构造方法
        int iNum = 10;
        Integer i = new Integer(iNum);

        double dNum = 1.5;
        Double d = new Double(dNum);

        char cNum = 'a';
        Character c = new Character(cNum);

        float fNum = 9.6f;
        Float f = new Float(fNum);

        boolean bNum = true;
        Boolean b = new Boolean(bNum);
        //
        //(2) 除Character以外，以字符串作为参数
        Integer i1 = new Integer("123");
        Double d2 = new Double("4.5");
        Float f3 = new Float("2.5f");
        System.out.println(f3);

        Boolean b3 = new Boolean("True");
        System.out.println(b3);

        Boolean b4 = new Boolean("ss");
        System.out.println(b4);


    }
}
