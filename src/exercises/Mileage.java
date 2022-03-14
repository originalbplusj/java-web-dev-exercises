package exercises;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args){
        double miles;
        double gas;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        miles = input.nextDouble();

        System.out.println("Enter the amount of gas consumed: ");
        gas = input.nextDouble();

        mpg = miles / gas;
        System.out.println("Your mileage is: " + mpg);
    }
}
