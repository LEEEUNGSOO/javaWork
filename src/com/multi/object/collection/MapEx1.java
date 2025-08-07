package com.multi.object.collection;

import java.util.HashMap;

public class MapEx1 {
    public void mapMethodEx1(){
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"유원상");
        hashMap.put(2,"권성민");
        hashMap.put(3,"지예린");
        hashMap.put(4,"홍예린");
        System.out.println(hashMap.toString());//toString 호출되어 문자열로 반환
        String name= String.valueOf(hashMap.get(2).startsWith("유")).charAt(0)=='t'?"유원상":"아마나";
        System.out.println(name);

    }
    public static void main(String[] args) {
        MapEx1 map = new MapEx1();
        map.mapMethodEx1();
    }
}
