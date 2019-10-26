package com;

public class SwitchCaseGradeCalculate {
    public static void main(String[] args) {
        int grade=0;
        String gradeRead="";
        switch ((grade>=0&&grade<50)?0:(grade>=50&&grade<60)?1:(grade>=60&&grade<70)?2:(grade>=70&&grade<80)?3:(grade>=80&&grade<90)?4:(grade>=90&&grade<=100)?5:6){

            case 0 : gradeRead="Fail"; break;
            case 1: gradeRead = "D"; break;
            case 2 :gradeRead="C"; break;
            case 3 : gradeRead="B"; break;
            case 4 : gradeRead="A";break;
            case 5: gradeRead ="A+"; break;
            default:
                System.out.println("İnavalid score");



        }
        System.out.println("Your score is :" +gradeRead);
    }

}

