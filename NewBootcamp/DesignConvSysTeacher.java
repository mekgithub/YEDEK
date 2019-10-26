package com;

import java.util.Scanner;

public class DesignConvSysTeacher {
    public static void main(String[] args) {
        Scanner conv=new Scanner((System.in));
        System.out.println("T,W,D*");
        String answer=conv.next();


        if(answer.equalsIgnoreCase("T")){
            System.out.println("C?, F?");
            String temp=conv.next();

            if(temp.equalsIgnoreCase("C")){
                System.out.println("From C to F ?");
            }

        }

    else if(answer.equalsIgnoreCase("W")){
            System.out.println("g?,l?");
            String weight=conv.next();
            if(weight.equalsIgnoreCase("g"))
                System.out.println("From g to l?");
        else{
                System.out.println("From l to g");

        }

    }
    else{
            System.out.println( "km or mil ?");
            String distance=conv.next();
            if(distance.equalsIgnoreCase("km")){
                System.out.println("From km to mil");
            }else{
                System.out.println("From mil to km");
            }




    }  }



}

