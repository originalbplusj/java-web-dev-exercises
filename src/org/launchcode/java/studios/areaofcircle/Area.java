package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        double radius;
        double area;
        //double pi;
        //pi = 3.14;

        input = new Scanner(System.in);


        System.out.println("Enter the radius: ");
        radius = input.nextDouble();

        area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area);


        /*while (!input.hasNextDouble()) {
            System.out.println("Invalid Entry");
            break;
        }
        if (input.hasNextDouble()) {
            radius = input.nextDouble();
        }
        if (radius > 0) {

            area = Math.PI * radius * radius;
            System.out.println("The area of the circle is: " + area);
        } else {
            System.out.println("Invalid Entry");
        }*/

            //area = Circle.getArea(radius);



    }
}