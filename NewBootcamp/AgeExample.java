package com;

public class AgeExample {
    public static void main(String []args){
      int ageToCheck=20;
      if (ageToCheck<0){
            System.out.println(" Age cannot be negative");
        }
        else if(ageToCheck>120){
            System.out.println("Age cannot be larger than 120");

        }
        else
        {
            System.out.println("OK");
        }
    }
}