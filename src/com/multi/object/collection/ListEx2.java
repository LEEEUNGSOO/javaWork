package com.multi.object.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class ListEx2 {
    public void listMethodEx1(){
        Vector<String> list1=new Vector<String>();//ArrayList와 같은 List ,동시성제어
        list1.addElement("hello");
        list1.addElement("world");
        list1.add("Spring");
//        for (Object o : list1) {
//            System.out.println(o);
//        }
//        Iterator iterator= (Iterator) list1.iterator();
//        for(;iterator.hasNext();){
//            System.out.println(iterator.next());
//        }
         Enumeration enumeration= list1.elements();//열거형 자료형
         while (enumeration.hasMoreElements()) {//hasMoreElements는 다음 node여부 확인
             System.out.println(enumeration.nextElement());//현재 element를 반환하고 다음 node로 토스
         }


//        list1.remove("hello");
//        list1.contains("hello");

    }
    public void listMethodEx2(){
        //Stack
        Stack<String> stack=new Stack<String>();
        // 요소 추가
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack: " + stack); // Stack: [A, B, C]

        // 맨 위 요소 접근 (삭제하지 않음)
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement); // Top element: C

        // 스택 요소 출력
        System.out.println("Stack after pop: " + stack); // Stack after pop: [A, B]

        // 스택이 비어 있는지 확인
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty); // Is stack empty? false

        // 요소 검색
        int position = stack.search("C");
        System.out.println("Position of 'C': " + position); // Position of 'A': 2

        // 모든 요소 꺼내기
//        while (!stack.empty()) {
//            System.out.println("Popped: " + stack.pop());
//        }

        // 스택이 비어 있는지 확인
        System.out.println("Is stack empty? " + stack.empty()); // Is stack empty? true

    }
    public static void main(String[] args) {
        ListEx2 listEx2=new ListEx2();
        //listEx2.listMethodEx2();

        Stack<String>stack=new Stack<String>();
        stack.push("Java");
        stack.push("Css");
        stack.push("Html");
        stack.push("Ajax");
        stack.push("Spring");
        System.out.println(stack.peek());
        System.out.println(stack.search("Spring"));
       // System.out.println(stack.indexOf("Java"));
        //System.out.println(stack.lastIndexOf("Java"));

    }
}
