package com.multi.object.package1;

public class SubClass extends SuperClass{
    public SubClass(){
        //SuperClass의 후손 생성장
        this.publicData=100;
        this.protectedData=100;
        this.defaultData=100;
        //this.privateData=100;private은 자기 자신만 접근이 가능해요...

    }
}
