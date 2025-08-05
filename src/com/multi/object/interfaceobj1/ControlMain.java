package com.multi.object.interfaceobj1;

public class ControlMain {
    public static void main(String[] args) {
        RemoteControl remoteControl=new TV();
        remoteControl.trurnOn();
        remoteControl=new Radio();


    }
}
