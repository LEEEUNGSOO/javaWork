package com.multi.object.inheritance2;

import com.multi.object.arrayclass.Person;

public class Test {
    public static void main(String[] args) {
        String []str=new String[4];//[][][][]
        System.out.println(str[0]);
        Person[]p= new Person[5];//[][][][][]
        p[0]=new Person();

    }
}
