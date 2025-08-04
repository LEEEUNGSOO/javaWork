package com.multi.variable;
//Java는 객체지향언어
public class VariableEx5 { //객체를 설계하는 설계도

    //속성 +기능
    short   value;//heap
    boolean isCheck;
    static int staticData;
    public void sayMethod(){//method
       int localSay=100;//지역변수 stack

    }
    public void eatMetod(){
       // localSay=90; 사용불가
       //isCheck=true;
    }
    public static void main(String []args){
        VariableEx5   v= new VariableEx5();
        v.sayMethod();
        v.eatMetod();
        v.value=99;
        //value=88; 접근 불가
        staticData=45;
    }

}
