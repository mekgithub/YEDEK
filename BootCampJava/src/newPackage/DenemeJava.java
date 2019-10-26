package newPackage;

public class DenemeJava {
    public static void main(String []args){
        double en =20;
        double boy=30;
        double dikDörtgenvsvs= en/(boy*boy);
        System.out.println("Dkdörgenin Vsresi :" +dikDörtgenvsvs);

        double dikDörtgenAlanı= en*boy;
        System.out.println("Dikdörgenin Alanı:" +dikDörtgenAlanı);

        double piNumber= 3.14;
        double radiusNumber= 5;
        double perimeterCircle= 2*piNumber*radiusNumber;
        System.out.println("Cemberin cevresi:" + perimeterCircle);
        //Dairenin alanı
        double areaCircle=piNumber*radiusNumber*radiusNumber;
        System.out.println("Dairenin Alanı:"+areaCircle);
        //Gold Price hespalama

        double amounGold=5.7658;
        double priceGold= 128.87654;
        double goldPrice=amounGold*priceGold;
        System.out.printf("Altının Fıyatı $%.3f",goldPrice);



    }
}
