package com;

public class StringComparison {
    public static void main(String[]args){
        String check1="aaa";//a ile a yı comp ettik result 0,
        String check2="a5";
        System.out.println(check1.compareTo(check2));
        if(check1.compareTo(check2)==0){
            System.out.println("They are equal");

        }
    }
}
