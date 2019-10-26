package com;

public class WhileDowhilefromhundredtozero {
    public static void main(String[] args) {
        int start1=100;
        double start2=99.5;// buraya 100f yerine 100 de yazıabilir
        do{
            System.out.println(start1);
            if(start2>0)
            System.out.println(start2);
            start1--;
            start2=start2-1;
        }while (start1>=0);
    }
}
//*****ASAGIDA 2 FARKLI CZUM YOLU DAHA VAR !!!!


//my solutiın with while not dowhile
//double counter=100;
//        while(counter>0 ){
//            counter=counter-0.5;
//                System.out.println(counter);
//            }
// HOCANIN BİRİNİC YOL COZUMU
// double start=100;// buraya 100f yerine 100 de yazıabilir
//        do{
//            System.out.println(start);
//            start=start-0.5;
//        }while (start>=0);
//    }
//}