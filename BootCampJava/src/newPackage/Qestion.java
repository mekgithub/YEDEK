package newPackage;
import java.util.Scanner;
public class Qestion {
    public static void main(String []args){
    Scanner userinfo=new Scanner(System.in);
    System.out.print("Please write your name: ");
    String userName = userinfo.next();
    System.out.println("Please enter your Age: ");
    int userAge =userinfo.nextInt();
    System.out.println(userAge);
    }

}
