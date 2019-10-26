package newPackage;
import java.util.Scanner;
public class DesignRecipt {
    public static void main(String [] args) {
        Scanner designRecipt = new Scanner((System.in));
        System.out.print("Bagel:$");
        float product1=designRecipt.nextFloat();

        System.out.printf("EGG: $");
        float product2 = designRecipt.nextInt();


    }
}
// Spublic static void main(String []args){
//    Scanner userinfo=new Scanner(System.in);
//    System.out.print("Please write your name: ");
//    String userName = userinfo.next();
//    System.out.println("Please enter your Age: ");
//    int userAge =userinfo.nextInt();
//    System.out.println(userAge);
//    }
//double amounGold=5.7658;
//        double priceGold= 128.87654;
//        double goldPrice=amounGold*priceGold;
//        System.out.printf("Altının Fıyatı $%.3f",goldPrice);