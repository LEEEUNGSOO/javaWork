package com.multi.object.interfaceobj;

public class Radio implements  RemoteControl{

    @Override
    public void trurnOn() {
        System.out.println("라디오 전원 꺼짐");
    }

    @Override
    public void trurnOff() {
        System.out.println("라디오 전원 꺼짐");

    }
}
