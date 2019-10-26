package com;
//Convert int 300 to byte and print both of them
//Convert double 2.12345678901112131415 to float and print both of them
//try to convert String "Hello" to char.
public class Qouestion {
    public static void main(String []args){
        int myVariableToConvert = 300;
        byte newVariable =(byte) myVariableToConvert;
        System.out.println("This is Integer:" + myVariableToConvert);
        System.out.println("This is Byte: " + newVariable);

        double myDoubletofloat = 2.12345678901112131415;
        float newValueOfDouble = (float) myDoubletofloat;
        System.out.println("This is Double :" + myDoubletofloat);
        System.out.println(" This is Float:"+ newValueOfDouble);

        //


    }
}
