package com.multi.object.interfaceobj;

//Interface는 완전 추상클래스
//속성이 final static이다
public interface RemoteControl {
    public int value=100;//상수만
    public abstract void trurnOn();
    public abstract void trurnOff();

}
