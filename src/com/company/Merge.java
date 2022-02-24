package com.company;

import java.util.concurrent.ConcurrentMap;

public class Merge {
    private static Comparable[] assist;
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    private static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public  static void sort(Comparable[] a){
        //初始化辅助数组assist
        //定义一个lo变量，分别记录数组中最小的索引和最大的索引
        //调用sort重载方法完成数组a中，从索引lo到索引hi的元素的排序
        assist=new Comparable[a.length];
        int lo=0;
        int hi=a.length-1;
        sort(a,lo,hi);

    }
    private static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo){
            return;
        }
        int mid=lo+(hi-lo)/2;
        sort(a,lo,mid);
        sort(a, mid+1,hi);

        merge(a,lo,mid,hi);

    }
    private static void merge(Comparable[] a,int lo,int mid,int hi){
            int i=lo;
            int p1=lo;
            int p2=mid+1;
            while(p1<=mid&&p2<=hi){
                if(less(a[p1],a[p2]))
                    assist[i++]=a[p1++];
                else
                    assist[i++]=a[p2++];

            }
            while(p1<=mid){
                assist[i++]=a[p1++];
            }
            while(p2<=hi){
                assist[i++]=a[p2++];
            }
            for(int index=0;index<=hi;index++){
                a[index]=assist[index];
            }
    }
}
