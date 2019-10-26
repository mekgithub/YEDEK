package newPackage;
import java.util.Scanner;
public class RectangleFromUser {
    public static void main(String[] args) {
        Scanner rectangle= new Scanner(System.in);
        System.out.print(" Enter rectangle height: ");
        int height = rectangle.nextInt();
        System.out.print("Enter length please:$ ");
        int lenght =rectangle.nextInt() ;
        int areaRectangle= lenght*height;
        System.out.println("The area of rectangle is: " + areaRectangle);
    }
}
