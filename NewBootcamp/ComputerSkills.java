package com;
import java.util.Scanner;
public class ComputerSkills {
    public static void main(String[]args){
        Scanner compSkill=new Scanner(System.in);
        System.out.println("What is your skill Java or SQL or CLOUD");
        String skill=compSkill.next();

        if(skill.equalsIgnoreCase("Java")){
            System.out.println("QA score");
            int qaScore =compSkill.nextInt();
            if(qaScore>=80){
                System.out.println("Accepted");
            }
            else{
                System.out.println("Not Accepted");
            }
        }
        else if(skill.equals("SQL")){
            System.out.println("What is your Hackerrank Score");
            int hrsscore=compSkill.nextInt();
            if(hrsscore>=400){
                System.out.println("Good");
            }
            else if (hrsscore>300 && hrsscore < 400){
                System.out.println("Not Bad");
            }
            else{
                System.out.println("No cOmment");
            }
        }
        else {
            System.out.println("What is your Certification");
            String cert=compSkill.next();
            //if(cert.equalsIgnoreCase("Y")||cert.equals(y)
            if(cert.equals("Y")||cert.equals("yes")){
                System.out.println("GOOD JOB");

            }
            else{
                System.out.println("That is fine");
            }
        }
    }
}
