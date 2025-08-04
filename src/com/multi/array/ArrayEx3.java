package com.multi.array;

//2차원 배열
public class ArrayEx3 {

    //2차원배열 (행,열) 선형 자료구조
    public void arrayApp1(){
        int [][]m=new int[2][3];//
        //int []x=new int [5];
        //2차원배열의 이름은 행 갯수
        //열의주소.length 열의 갯수
        for(int i=0;i<m.length;i++){//행 갯수만큼
            for(int j=0;j<m[i].length;j++){
                m[i][j]=(int)(Math.random()*100);
                System.out.print(m[i][j]+" ");
            }
            System.out.println(Math.random());
        }

    }
    public void arrayApp2(){
        int []xx=new int[5];

        xx[0]=5;
        xx[1]=6;
        (new int[3])[0]=10;
        (new int[3])[1]=40;

        (new int[4][5])[0][1]=20;
    }
    public static void main(String[] args) {
        ArrayEx3 m=new ArrayEx3();
        m.arrayApp2();
    }

}
