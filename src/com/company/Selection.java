package com.company;

public class Selection {
    public static void sort(Comparable[] a){
        int minindex;
        for(int i=0;i<a.length-1;i++){
            minindex=i;
            for(int j=i+1;j<a.length;j++){
                if(greater(a[minindex],a[j])){
                    minindex=j;//交换最小值的索引
                }
            }
            exch(a,minindex,i);

        }
    }
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
