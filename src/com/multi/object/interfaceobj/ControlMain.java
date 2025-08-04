package com.multi.object.interfaceobj;

public class ControlMain {
    public static void main(String[] args) {
        RemoteControl remoteControl=new TV();
        remoteControl.trurnOn();
        remoteControl=new Radio();


    }
}
