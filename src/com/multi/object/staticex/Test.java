package com.multi.object.staticex;

public class Test {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println(y);
    }
}
