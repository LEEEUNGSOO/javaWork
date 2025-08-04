package com.multi.variable;

public class VariableEx6 {

    public void intValue(int count){
        for(int i=1;i<=count;i++){
            if(i%7==0) System.out.println();
            System.out.print(i+"\t");
        }
        //System.out.println(i); error
    }
    public void byteValue(byte x,byte y){
        float floatValue=(float)7.0;

    }
    public static void main(String[] args) {
        VariableEx6 variableEx6=new VariableEx6();
       // variableEx6.intValue(10);
        variableEx6.byteValue((byte)5,(byte)7);

    }

}
