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

}
