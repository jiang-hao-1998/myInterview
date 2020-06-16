package com.jiang.base;

import org.junit.Test;

import java.lang.reflect.Array;

public class j2se {
    @Test
    public void fun0(){
        //选择排序
        int[] array ={2,5,4,1,8,9,0};
        for(int i=0;i<array.length;i++){
            int temp=i;
            for (int j=i+1;j<array.length;j++){
                if (array[temp]>array[j]){
                    temp = j;
                }
            }
            if(temp!=i){
                int t = array[temp];
                array[temp]=array[i];
                array[i]=t;
            }
        }
        for (int a :
                array) {
            System.out.print(a+",");
        }
    }

    @Test
    public void fun1(){
        //冒泡排序
        int[] array ={2,5,4,1,8,9,0};
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }
        for (int a=0;a<array.length;a++) {
            System.out.print(array[a]+",");
        }
    }

    @Test
    public void fun2(){
        //求1+1/2-1/3+...到n的值
        int n=100;
        double result=1.0;//result要为小数
        for(int i =2; i<n+1;i++){
            if(i%2==0){
                result=result+1.0/i;//注意,分子要为小数
            }else{
                result=result-1.0/i;
            }
        }
        System.out.println("*******");
        System.out.println(result);
    }
















}
