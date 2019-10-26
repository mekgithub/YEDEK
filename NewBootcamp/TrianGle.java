package com;

public class TrianGle {
    public static void main(String[]args){
        int a=1000;
        int b=120;
        int c=140;
        if(a+b>c && a+c>b && b+c>a ){
            System.out.println(" These sides can form a Triangle");
        } else {
            System.out.println("These sides can not form a triangle");
        }
    }
}
