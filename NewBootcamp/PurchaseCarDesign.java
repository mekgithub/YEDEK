package com;
import java.util.Scanner;
public class PurchaseCarDesign {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);
        System.out.print("X or Y");
        String answer = car.next();
        if(answer.equals("X") || answer.equals("x") ){
            System.out.print("Do you want \"body\" package: (Y/N)");
            String body = car.next();
            if(body.equalsIgnoreCase("Y")){
            }
            else if(body.equalsIgnoreCase("N")){
            }
            else {
                System.out.println("Please Y or N");
            }
            System.out.print("Do yu want sound? (Y/N)");
            String sound = car.next();
            if(sound.equalsIgnoreCase("Y")){
            }
            else if(sound.equalsIgnoreCase("N")){
            }
            else {
                System.out.println("Please Y or N");
            }
        }
        else if (answer.equalsIgnoreCase("Y")){
            System.out.print("Do you want Ent. pack.? (Y/N)");
            String ent = car.next();
            if(ent.equalsIgnoreCase("Y")){
            }
            else if (ent.equalsIgnoreCase("N")){
            }
            else {
                System.out.println("Please Y or N");
            }
            System.out.print("Safety? (Y/N)");
            String safety = car.next();
            if(safety.equalsIgnoreCase("Y")){
            }
            else if(safety.equalsIgnoreCase("N")){
            }
            else {
                System.out.println("please Y or N");
            }
        }
        else {
            System.out.println("X or Y only");
        }
    }
}
//Calculate the Shipping price according to listed requirements
//
//Weight between 1-5 lbs = 12 pt
//
//Weight between 6-12 lbs = 29 pt
//
//Weight 13+ = 50 pt
//
//Volume between 5-10 = 20 pt
//
//Volume between 11-20 = 45 pt
//
//Distance as mile
//
//
//
//Calculation
//
//Price Ground = ((Weight * VOLUME ) / 11 )  * distance / 100
//
//Price Urgent = ((Weight * VOLUME) / 5)  * distance / 100
//
//