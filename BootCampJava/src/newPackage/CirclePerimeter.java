package newPackage;

public class CirclePerimeter {
    public static void main(String[]args){
        //calculating circle perimeter
        double piNumber =3.1427;
        double radius = 5.68;
        double circlePerimeter= 2 * piNumber * radius;
        System.out.println(circlePerimeter);

        //Calculating Rectangle Perimeter
        int widthRectangle = 11;
        int heightRectangle = 22;
        int perimeterRectangle = 2*(widthRectangle + heightRectangle);
        System.out.println(perimeterRectangle);

        // Calculating Triangle Perimeter
        int edge1 = 51;
        int edge2 = 96;
        int edge3 = 56;
        int perimeterTriangle = edge1 + edge2 +edge3;
        System.out.println(perimeterTriangle);

        //Calculatinh Convert Celsius to Fahrenheit
        double celcius = 24;
        double  multiplier1= 9;
        double multiplier2 = 5;
        double adder = 32;
        double  convertinFahrenheit= celcius * multiplier1/multiplier2 + adder;
        System.out.println(convertinFahrenheit);


    }
}