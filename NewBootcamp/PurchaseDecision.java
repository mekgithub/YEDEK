package com;
import java.util.Scanner;
public class PurchaseDecision {
    public static void main(String[]args){
        Scanner scanColor=new Scanner(System.in);
        System.out.println( "Please enter color");
        String color=scanColor.next();

        Scanner scanPrice=new Scanner(System.in);
        System.out.println("Please enter price");
        double  price=scanPrice.nextDouble();

        Scanner scanDiscount=new Scanner(System.in);
        System.out.println("Please enter tehe discount");
        int discount=scanDiscount.nextInt();
        double point=0;

        if(color.equals("red")){
          point=price*discount-20;
        }if(color.equals("Blue")){
            point=price*discount-10;
        }if(point>100){
            System.out.println("Buy ıt");
        }if(point<=100&&point>=50){
            System.out.println("Buy it later");
        }if(point<50){
            System.out.println("Buy it now");
        }


        //if(shape.equals("C")){
        //            System.out.print("Please enter radius.");
        //            double radius=scanParameter.nextDouble();
        //            perimeter=2*3.14*radius;
        //   System.out.println("Please color 20 for RED or 10 for Blue");


    }
}




//