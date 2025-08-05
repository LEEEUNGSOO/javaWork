package com.multi.exception;
//Exception은 예외 (Compile|RunTime)
public class ExceptionEx1 {
    public void nullPointerExceptionExample1(String str ){
        //String str=null;
        str=str.charAt(0)!='A'?null:str;
        System.out.println(str.startsWith("Ajax"));
    }
    public void arrayIndexOutOfBoundsExceptionExample1(){
        int []m=new int[5];
        for(int i=0;i<=5;i++){
            try {// 도전코드....
                m[i]=i;
            }catch (ArrayIndexOutOfBoundsException e){//예외발생 구간~
                System.out.println("ArrayIndexOutOfBoundsException~~~");
                e.printStackTrace();
                /*
                printStackTrace로 인한 메시지
                java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	            at com.multi.exception.ExceptionEx1.arrayIndexOutOfBoundsExceptionExample1(ExceptionEx1.java:13)
	            at com.multi.exception.ExceptionEx1.main(ExceptionEx1.java:24)
                 */
            }finally {//꼭
                System.out.println("finally~~~");
                
            }
        }

    }
    public static void main(String[] args) {
        ExceptionEx1 obj=new  ExceptionEx1();
        //obj.nullPointerExceptionExample1("SpringLesson");
        obj.arrayIndexOutOfBoundsExceptionExample1();


    }
}
