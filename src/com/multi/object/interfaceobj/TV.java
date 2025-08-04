package com.multi.object.interfaceobj;

//class(설계도,사용자정의 자료형)
//inhertiance(상속)

public   class TV implements RemoteControl, VolumeControl {
    @Override
    public void trurnOn() {
        System.out.println("TV 전원 켜짐");
    }

    @Override
    public void trurnOff() {
        System.out.println("TV 전원 꺼짐");

    }
    @Override
    public void volumeUp() {
        System.out.println("volumeUp() ");
    }
    @Override
    public void volumeDown() {
        System.out.println("volumeDown() ");

    }

    public static void main(String[] args) {
    }
}
