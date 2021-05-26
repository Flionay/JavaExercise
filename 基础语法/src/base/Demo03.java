public class Demo03 {
    public static void main(String[] args) {
        //证书拓展 二进制0b 十进制 八进制0 十六进制0x
        int i = 10;
        int i2 = 0x10; //十六进制
        int i3 = 010; //八进制
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("=============================");

        //==================================
        //浮点数拓展 银行业务怎么表示？
        // BigDecimal 数学工具类
        //==================================
        //float 有限 离散 舍入误差 大约 接近但不等于
        //double

        float f = 0.1f;
        double d = 0.1;
        System.out.println(f==d);

        float d1=231123123123f;
        float d2 = d1+1;
        System.out.println(d1==d2);

        //==================================
        //字符拓展
        //==================================
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1); // 强制转换
        //所有的字符本质还是数字

        System.out.println(c2);
        System.out.println((int)c2);


    }
}
