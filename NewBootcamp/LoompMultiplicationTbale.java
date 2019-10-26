package com;

public class LoompMultiplicationTbale {
    public static void main(String[] args) {
        for(int i=1 ;i <11 ; i++){
            for(int j=1 ; j<=10; j++ ){
                System.out.print(j+ "  x  " + i + " = " + i*j+ "   ");
                if(j==10){
                    System.out.println();
                    //burada sonuc olarak 1x1,1x2,1x3 olarak devamlı i nin 1,1,1,1 oması
                    // ama j nin 1,2,3 diye devam etmesi kulanılan iki adet for (nested if kalıbı )
                    // yani kullanılmasııdır.
                }

            }
            //System.out.println(i+ "  x  " + j+ " = " + i*j + "  "); o zaman
            // carpım tabşlosu yanayana olur dedı hoca
            // ama bende olmadı.

        }
    }


}
