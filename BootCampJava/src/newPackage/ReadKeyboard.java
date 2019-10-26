package newPackage;
import java.util.Scanner;
public class ReadKeyboard {
    public static void main(String[]args){
        Scanner readFromKeyboard = new Scanner(System.in);
        System.out.println("Please Enter your name:");
        String firstRead = readFromKeyboard.next();
        System.out.println(firstRead);



    }
}
