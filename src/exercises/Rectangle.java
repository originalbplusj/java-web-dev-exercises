package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the rectangle length: ");
        length = input.nextDouble();

        System.out.println("Enter the rectangle width: ");
        width = input.nextDouble();

        area = (length * width);
        System.out.println(("The area of the rectangle is: " + area));

    }
}
