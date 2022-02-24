package com.test;

import com.company.Student;

public class TestComparable {
    public static void main(String[] args) {
        Student a1=new Student();
        Student a2=new Student();
        a1.setAge(18);
        a1.setName("张三");
        a2.setAge(20);
        a2.setName("李四");
        Comparable max=getMax(a1,a2);
        System.out.println(max);

    }
    public static Comparable getMax(Comparable o1,Comparable o2)
    {
        int i=o1.compareTo(o2);
        if(i>0)
            return o1;
        else
            return o2;
    }
}
