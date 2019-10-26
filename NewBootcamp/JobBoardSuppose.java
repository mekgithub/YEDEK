package com;

import java.util.Scanner;

public class JobBoardSuppose {
    public static void main(String []args){
        Scanner jobScore=new Scanner(System.in);

        System.out.println("Enter Java SCORE:ENTRY,JUNIOR,SENIOR");
        String javaLevel=jobScore.nextLine();
        System.out.println("Enter SQL Level");
        int SQLLevel=jobScore.nextInt();
        System.out.println("Enter your experience year");
        int Expr=jobScore.nextInt();

        int Score=0;

        if(javaLevel.equals("ENTRY")){
            Score=(5000+SQLLevel)*Expr;
        }
        if (javaLevel.equals("Junior")){
            Score=(10000+SQLLevel)*Expr;
        }
        if (javaLevel.equals("SENIOR")){
            Score=(20000+SQLLevel)*Expr;
        }
        if (Score>10000){
            System.out.println("We offer $80000");
        } if(Score>7000&&Score<10000){
            System.out.println("We offer you $60000");
        }
        if(Score<7000&& Score>5000){
            System.out.println("We ofer $40000");
        }else{
            System.out.println("We will keep your resume");
        }


    }
}
