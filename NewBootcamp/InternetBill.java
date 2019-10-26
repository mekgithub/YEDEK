package com;
import java.util.Scanner;
public class InternetBill {
    public static void main(String []args){
        Scanner internet=new Scanner(System.in);
        System.out.println("Do you subscribed ?");
        String subscribtion=internet.nextLine();
        if(subscribtion.equals("Y")){
            System.out.println("Usage ?");
            int usage=internet.nextInt();
            if(usage<=100){
                System.out.println("$10");
            }
            else {
            System.out.println("$40");
            }
        }
        else {
            System.out.println("Please visit subscription page");
        }

    }
}