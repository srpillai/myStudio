package src;

import src.Circle;

import java.util.Scanner;

public class PrintArea {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = in.nextDouble();
        Double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
    }
}