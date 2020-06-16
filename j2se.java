package com.jiang.base;

import org.junit.Test;

import java.lang.reflect.Array;

public class j2se {
    @Test
    public void fun0() {
        //选择排序
        int[] array = {2, 5, 4, 1, 8, 9, 0};
        for (int i = 0; i < array.length; i++) {
            int temp = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[temp] > array[j]) {
                    temp = j;
                }
            }
            if (temp != i) {
                int t = array[temp];
                array[temp] = array[i];
                array[i] = t;
            }
        }
        for (int a :
                array) {
            System.out.print(a + ",");
        }
    }

    @Test
    public void fun1() {
        //冒泡排序
        int[] array = {2, 5, 4, 1, 8, 9, 0};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + ",");
        }
    }

    @Test
    public void fun2() {
        //求1+1/2-1/3+...到n的值
        int n = 100;
        double result = 1.0;//result要为小数
        for (int i = 2; i < n + 1; i++) {
            if (i % 2 == 0) {
                result = result + 1.0 / i;//注意,分子要为小数
            } else {
                result = result - 1.0 / i;
            }
        }
        System.out.println("*******");
        System.out.println(result);
    }

    @Test
    public void math(){
        // public static final double PI
        System.out.println("PI:" + Math.PI);
        // public static final double E
        System.out.println("E:" + Math.E);
        System.out.println("--------------");
        // public static int abs(int a)：绝对值
        //取a的绝对值
        System.out.println("abs:" + Math.abs(10));
        System.out.println("abs:" + Math.abs(-10));
        System.out.println("--------------");

        // public static double ceil(double a):向上取整
        System.out.println("ceil:" + Math.ceil(12.34));
        System.out.println("ceil:" + Math.ceil(-12.56));
        System.out.println("--------------");

        // public static double floor(double a):向下取整
        System.out.println("floor:" + Math.floor(12.34));
        System.out.println("floor:" + Math.floor(-12.56));
        System.out.println("--------------");

        // public static int max(int a,int b):最大值
        System.out.println("max:" + Math.max(12, 23));
        // 需求：我要获取三个数据中的最大值
        // 方法的嵌套调用
        System.out.println("获取三个数据中的最大值max:" + Math.max(Math.max(12, 23), 18));
        // 需求：我要获取四个数据中的最大值
        System.out.println("获取四个数据中的最大值max:"
                + Math.max(Math.max(12, 78), Math.max(34, 56)));
        System.out.println("--------------");

        // public static double pow(double a,double b):a的b次幂
        System.out.println("pow:" + Math.pow(2, 3));
        System.out.println("--------------");

        // public static double random():随机数 [0.0,1.0)
        System.out.println("random:" + Math.random());
        // 获取一个1-100之间的随机数
        System.out.println("random:" + ((int) (Math.random() * 100) + 1));
        System.out.println("--------------");

        // public static int round(float a) 四舍五入(参数为double的自学)
        System.out.println("round:" + Math.round(12.34f));
        System.out.println("round:" + Math.round(12.56f));
        System.out.println("round:" + Math.round(-12.56f));
        System.out.println("round:" + Math.round(-12.26f));
        System.out.println("--------------");

        //public static double sqrt(double a):正平方根
        System.out.println("sqrt:"+Math.sqrt(4));
    }











}
