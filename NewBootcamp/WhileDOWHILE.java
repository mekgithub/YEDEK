package com;

public class WhileDOWHILE {
    public static void main(String[] args) {
        int counter = 0;
        do{
            if(counter==100){
                System.out.println(counter);

            }
            System.out.println(counter);
            counter++;
        }while(counter<=0);
        counter--;
    }
}
