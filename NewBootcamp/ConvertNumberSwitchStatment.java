package com;

public class ConvertNumberSwitchStatment {
    public static void main(String[] args) {
        String number= "Two";
    int converNumber=0 ;
                switch (number){
        case "Zero": converNumber= 0;
            break;
        case "One":converNumber=1;
            break;
        case "Two":converNumber=2;
            break;
        case "Three":converNumber=3;
            break;
        case "Four":converNumber=4;
            break;
        case "Five":converNumber=5;
            break;
        case "Six": converNumber=6;
            break;
        case "Seven":converNumber=7;
            break;
        case "Eigth":converNumber=8;
            break;
        case "Nine":converNumber=9;
            break;
        default:
            System.out.println("invaild");
            break;
    }

        System.out.println(converNumber);
}
}


//Calculate Student String Grade according to integer score (0-100) and use switch case statement
//
//Intervals
//
//0-49 Fail
//
//50-59 D
//
//60-69 C
//
//70-79 B
//
//80-89 A
//
//90-100 A+
//
//Sample input  85    output A













