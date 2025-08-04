package com.multi.variable;
//변수는 메모리이다
public class VariableEx1 {
    public static void main(String[] args) {
//        byte byteValue = 10;
//        System.out.println(byteValue);
//        int intValue = 20;
//        System.out.println(intValue);
//        boolean booleanValue = true;
//        System.out.println(booleanValue);

        int userAge = 25;               // Camel Case로 명명
        boolean isActive = 5>7;        // Boolean 변수명은 is로 시작
        final int MAX_SIZE = 100;       // 상수는 대문자와 언더스코어 사용


        System.out.println("User Age: " + userAge);
        System.out.println("Is Active: " + isActive);
        System.out.println("Max Size: " + MAX_SIZE);

    }
}
