package com;

public class SwitchStatement {
    public static void main(String[] args) {
        int month = 9 ;
        String montString="";
        switch (month){
            case   1:montString ="January";
            break;
            case 2:montString="February";
            break;
            case 3:montString="March";
            break;
            case 4:montString="April";
            break;
            case 5:montString="May";
            break;
            case 6:montString="Jun";
            break;
            case 7:montString="July";
            break;
            case 8:montString="Agust";
            break;
            case 9:montString="Sep";
            break;
            case 10:montString="Oct";
            break;
            case 'a':montString="Nov";
            break;
            case 12:montString="December";
            break;
            default:
                System.out.println("invalid");
                break;
        }
        System.out.println(montString);
    }
}
