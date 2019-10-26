package newPackage;

import jdk.swing.interop.SwingInterOpUtils;

public class CharExample {
    public static void main(String[] args){


        byte myByte = 45;
        char myChar = 'z';
        short myShort = 5345;
        int myInt = 2342342;
        float myFloat = 4535345;
        double myDouble=453453;

        double result =(myByte* myShort)+ (myChar+21)*2+(myDouble/myFloat);

        System.out.println(result);


    }
}
