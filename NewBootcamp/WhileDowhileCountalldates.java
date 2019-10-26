package com;

public class WhileDowhileCountalldates {
    public static void main(String[] args) {
        for(int i=1; i<13; i++){
            System.out.println(i);
            for(int j=1; j<31; j++){
                System.out.println(i+ "/" +j+"/ "+"2019"+"  ");
                if(j==30){
                    System.out.println();
                }

            }
        }
    }
}

//for(int i=1 ;i <11 ; i++){
//            for(int j=1 ; j<=10; j++ ){
//                System.out.print(j+ "  x  " + i + " = " + i*j+ "   ");
//                if(j==10){
//                    System.out.println();