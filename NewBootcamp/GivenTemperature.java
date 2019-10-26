package com;

import java.util.Scanner;

public class GivenTemperature {
    public static void main(String[]args){

    Scanner tempInput= new Scanner(System.in);
    System.out.println("Please enter the temp");
    int temp= tempInput.nextInt();
    if(temp<=20){
        System.out.println("  Winter");
    }
    else if( temp>21&&temp<=40){
        System.out.println(" Fall ");
    }
    else if (temp>41 && temp<60){
            System.out.println("Spsring");
        }
        else    {
            System.out.println("Summer");
        }
}
}








