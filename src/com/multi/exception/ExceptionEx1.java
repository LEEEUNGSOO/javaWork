package com.multi.exception;
//Exception은 예외 (Compile|RunTime)
public class ExceptionEx1 {
    public void nullPointerExceptionExample1(String str ){
        //String str=null;
        str=str.charAt(0)!='A'?null:str;
        System.out.println(str.startsWith("Ajax"));
    }
    public static void main(String[] args) {
        ExceptionEx1 obj=new  ExceptionEx1();
        obj.nullPointerExceptionExample1("SpringLesson");

    }

}
