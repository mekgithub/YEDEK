package com;
import java.util.Scanner;
public class CalculateGrade {
    public static void main(String[]args){
        Scanner calcGrade= new Scanner(System.in);
        System.out.println( "Enter de grade");
        int  exam=calcGrade.nextInt();

        if(exam>0 && exam<= 49) System.out.println("Grade is Fail");
        if(exam>=50 && exam<=59)System.out.println("Grade is D");
        if(exam>060 && exam<=69)System.out.println("Grade is C");
         if(exam>=70 && exam<=79) System.out.println("Grade is B");
        if(exam>= 80 && exam<=89) System.out.println("Grade is A");
        if(exam>=90 && exam<=100)  System.out.println("Grade is A+");
        else System.out.println("Not Valid Exam");
    }
}
