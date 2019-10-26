package newPackage;

public class ConversionBiggerToSmaller {
    public static void main(String[]args){
        double theBiggest =259.98956;
        float theBigger = (float) theBiggest ;
        long big = (long)theBigger;
        int medium =(int) big;
        short smaller = (short) medium;
        byte theSmallest = (byte) smaller;

        System.out.println("this is double:" + theBiggest);
        System.out.println("This is float:" + theBigger);
        System.out.println("This is Long :" + big );
        System.out.println("This is integer:" + medium);
        System.out.println("This is Short:" + smaller );
        System.out.println("This is Byte:" + theSmallest );



    }
}
