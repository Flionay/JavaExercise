package com.angyi.www.suanfa;

public class MeanMiddle {
    public static void main(String[] args) {
        int[] salary = {100,70,80,90,50};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        int min_s = salary[0];
        int max_s = salary[0];
        int sum = 0;
        for(int i=0;i<salary.length;i++){
            if (min_s > salary[i]){
                min_s = salary[i];
            }
            if (max_s < salary[i]){
                max_s = salary[i];
            }
            sum += salary[i];
        }
        double sum_s = sum-min_s-max_s;
        double res = sum_s/(salary.length-2);
        return res;

    }

}
