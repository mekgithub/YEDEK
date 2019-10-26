package com;

public class CalculateTotalDistance {
    public static void main(String[] args) {

        String destination="SeatleTampa";
        int Distance= 0;
        switch (destination){

            case "HoustNewYork":Distance=1500;
            break;
            case "HoustonTampa":Distance=1000;
            break;
            case "HoustonSacramentoK":Distance=3000;
            break;
            case "SeatleNewYork": Distance=3500;
            break;
            case "SeatleTampa":Distance=4000;
            break;
            case "SeatleSacramento":Distance=500;
            break;
            default:
                System.out.println("ınvalid destination!");
        }
        System.out.println("Your Distance Mile is:"+ Distance);
    }
}


