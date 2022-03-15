package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input;
        double radius = -1;
        double area;
        boolean isValid = true;





        input = new Scanner(System.in);
        do {
            System.out.println("Enter the radius: ");
            while (!input.hasNextDouble()) {
                input.next();
                System.out.println("Invalid Entry. Please enter the radius: ");
            }
            radius = input.nextDouble();
            } while (radius < 0);

        area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area);



    }
    }