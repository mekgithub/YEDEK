package com;
import java.util.Scanner;
public class shippingCalculate {
    public static void main(String[]args){
        Scanner itemdetail=new Scanner(System.in);
        System.out.println("What is the wieght of item?");
        int weight=itemdetail.nextInt();
        int Wpoint=0;
        //Önce weight ve değerini hesaplıyoruz
        if(weight>=1&& weight<=5){
            Wpoint=12;
            System.out.println("weightpoints:" + Wpoint);
        }
        else if(weight>=6 && weight<=12){
            Wpoint=29;
            System.out.println("weightpoint:" + Wpoint);
        }
        else{
            Wpoint=50;
            System.out.println("weightpoint:" + Wpoint);
        }
          // şimdi height değerlerini hesaplıypruz
        System.out.println("Please enter teh Volume of item:");
        int Volume=itemdetail.nextInt();
        int Vpoint=0;

        if(Volume>=5 && Volume<=10){
            Vpoint=20;
            System.out.println("Volume is:" + Vpoint);
        }
        else if(Volume>=11 && Volume<=20){
            Vpoint=45;
            System.out.println("Volume is:" + Vpoint);
        }
        else{
            System.out.println("Please check your entry!");
        }
        //Şİmdi distance fiyatlarını hesaplayacağız;
        System.out.println("Please enter your distance as a mile: " );
         int Distance=itemdetail.nextInt();

        System.out.println("Calculation");

        System.out.println("Please choose G for Ground, choose U for Urgent");
        String Ground=itemdetail.next();
        String Urgent=itemdetail.next();

        if(Ground.equalsIgnoreCase("G")){
            double PriceGround=((Wpoint*Vpoint)/11)*Distance/100;
            System.out.println("Your Ground Price is:" + PriceGround);
        }
        else if(Urgent.equalsIgnoreCase("U")){
            double Priceurgent=((Wpoint*Vpoint/5))*Distance/100;
            System.out.println("Your Urgent Price is:" + Priceurgent);

            }
        else{
            System.out.println("Please enter U or G");

            }
        }

    }

