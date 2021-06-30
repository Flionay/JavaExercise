package com.angyi.www.base;

public class Test3 {
    public static void main(String[] args) {
        Integer i = new Integer("123");
        int ii = i.intValue();

        Boolean b = new Boolean("True");
        boolean bb  = b.booleanValue();

        //toString()
        int num = 10;
        String sNum = Integer.toString(num);

        boolean bs = true;
        String bsd = Boolean.toString(bs);
        System.out.println(bsd);

        //
        String nums = 100+"";
        String dsdd = true+"";
        System.out.println(dsdd);

        String age = "17";
        int ageNum = Integer.parseInt(age);

        String score = "100";
        int scores = Integer.parseInt(score);
        System.out.println(scores);


        int j = 90;
        Integer j1 = Integer.valueOf(j);

        String m = "123";
        Integer mi = Integer.valueOf(m);
        System.out.println(mi);
    }
}
