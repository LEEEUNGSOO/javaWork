package com.multi.object.staticex;

public class StaticEx4 {
    private int value;
    private int num;
    private String str;
    private double count;

    public void increment(){
        this.count++;
    }
    public static StaticEx3 message(){
        System.out.println("안녕");
        //this.value=100; this사용불가
       // return this ; error staticMetod에서는 this 사용 불가
        return null;
    }
    public static void main(String[] args) {
        StaticEx4.message();
    }
}
