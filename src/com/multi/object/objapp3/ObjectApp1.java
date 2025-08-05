package com.multi.object.objapp3;

public class ObjectApp1   extends Object implements Cloneable {
    public ObjectApp1(){
        try {
            //ObjectApp1 obj= this.clone();
            //ObjectApp1 obj=new Object(); error
            //Object obj=new ObjectApp1();
           ObjectApp1 obj=(ObjectApp1) this.clone();//DownCast
            System.out.println(obj.toString());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();

        }
    }
//    public Object get(){
//        return new ObjectApp1();
//    }

    public void appMethod1(){

    }
    public static void main(String[] args) {
        ObjectApp1 obj=new  ObjectApp1();


    }
}
