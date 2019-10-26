package com;
import java.util.Scanner;
public class DriverLicence {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Age?");
        int age=scanner.nextInt();
        if(age>=16){
            System.out.println("F for first time, R for Renew");
            String reason=scanner.next();
            if(reason.equals("F")){
                System.out.println("ID,photo,FORM");

            }else if(reason.equals("R")){
                System.out.println("Old Driving Licence");
            }
            else {
                System.out.println("Please F or R");
            }
        }
            else {
                System.out.println("You can not Apply");

            }
        }
    }

