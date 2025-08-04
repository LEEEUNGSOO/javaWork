package com.multi.variable;

public class VariableEx4 {
    public  void byteValue(){
        byte byteGab=10;
        System.out.println("byteValueMethod Call");
    }
    public  void shortVale(){
        //byteGab=20; 메소드 안에서는 지역 변수로 접근 불가
        System.out.println("shortValeMethod Call");
    }
    public static void main(String[] args) {// javac  VariableEx4.java--> VariableEx4.class
        int i=10;
        VariableEx4 v= new VariableEx4();
        v.byteValue();
        v.byteValue();
        v.byteValue();
        v.shortVale();

    }
}
