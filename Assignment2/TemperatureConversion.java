package NUIGAssignment.Programming1;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args){
        System.out.println("Please enter the temperature: ");
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        convertor c=new convertor();
        System.out.println("Enter F for fahrenheit, else enter C");
        Scanner sc1=new Scanner(System.in);
        String type=sc1.nextLine();
        if (type.equals("F")){
            System.out.println("The celsius temperature is "+c.celsius(temperature));
        }else if (type.equals("C")){
            System.out.println("The fahrenheit temperature is "+c.fahrenheit(temperature));
        }else{
            System.out.println("Please reenter the method type!");
        }
    }
}
class convertor{
    double celsius(double f){
        double Celsius= 5/9.0 * (f - 32);
        return Celsius;
    }
    double fahrenheit(double c) {
        double fahrenheit= 9/5.0 * c + 32;
        return fahrenheit;
    }
}
