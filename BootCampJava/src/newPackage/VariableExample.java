package newPackage;

public class VariableExample {
    public static void main (String[]args){
        String firstVariable = "Java is Cool";
        System.out.println(firstVariable);
        int number1 = 10;
        int number2 = 20;
        int total  =number1 + number2;
        System.out.println(total);
//integer number addition
        int number3 = 17;
        int number4=5;
        int division = number3 / number4;
        System.out.println(division);
/*
We covered double and int..
We changed the types and tested.(bundan önce aşağıda float yazılıydı doubşe yerine ancak float double taşıyaacağı için double deşkliği yaptık
 */
        double number5 =23.6;
        double number6 =4.3;
        double totalFloat =number5 + number6;
        System.out.println(totalFloat);

        double divisionFloat = number5/ number6;
        System.out.println(divisionFloat);

        double divisionFlat =number5/number6;
        System.out.println(divisionFloat);

        boolean firstBoolean = true;
        System.out.println(firstBoolean);



    }
}
