package newPackage;

public class AutoTypeConversion {
    public static void main(String[]args){
        byte theSmallest = 127;
        short smaller= theSmallest;
        int medium= smaller;
        long big = medium;
        float bigger = big;
        double thaBiggest= bigger;

        System.out.println("This is Byte \t:"+ theSmallest);
        System.out.println("This is short \t:"+ smaller);
        System.out.println("This is int \t:"+ medium);
        System.out.println("This is long \t:"+ big);
        System.out.println("This is float \t:"+ bigger);
        System.out.println("This is double \t:"+ thaBiggest);


    }
}
