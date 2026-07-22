//Write a function that takes in the radius as input and returns the circumference of a circle.


package Exercise;

import java.util.Scanner;

public class Que4 {
    public static double circumferencec(double r){
        double calculate = 2 * 3.14 *r;
        return calculate;


    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius :");
    float r = sc.nextFloat();

    double circumference = circumferencec(r);
    System.out.println("Circumference of Circle = " + circumference);

    sc.close();
}
}
