package com.multi.object.base;

public class Person1 {
    private String name;//속성,데이터,필드
    private int age;

    public static void main(String[] args) {
        Person1 p1=new Person1();//name|age
        Person1 p2=new Person1();//name|age
        p1.name="Java";
        p2.name="C";
        new Person1().age=50;
        System.out.println( new Person1().age);//0

    }
}
