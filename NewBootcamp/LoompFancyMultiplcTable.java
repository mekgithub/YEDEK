package com;

public class LoompFancyMultiplcTable {
    public static void main(String[] args) {
        System.out.print("  ");
        for(int k=1 ; k<10; k++){
            System.out.printf("%5d", k);// d yerine s yazılsa ne olur. 5 digit veya space ne zaman olur?
        }
        System.out.println();
        System.out.println("____________________________________________________");
        for(int i=1; i<10 ; i++){
            System.out.print(i +"|");
            for(int j=1; j<=9 ; j ++){
                System.out.printf("%5d", i*j);// %5d dmek 5 digit boşluk bıra dmek.

            }
            System.out.println();//for vertical println
        }
    }
}
