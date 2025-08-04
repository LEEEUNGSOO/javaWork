package com.multi.object.inheritance2;
//객체를 유기적으로 연결 한것을 상속이라한다
public class SubClass1  extends SuperClass{
    private int subClassValue;
    public SubClass1(int superClassValue,int subClassValue) {
        super(superClassValue);
        this.subClassValue = subClassValue;
        //this.superClassValue=2; 선조가 private 처리하면 접근 불가
    }

    @Override
    public String toString() {
        return   super.toString()+" "+ String.valueOf( this.subClassValue);
    }
}
