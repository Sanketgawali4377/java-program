//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.


package Exercise;

import java.util.Scanner;

public class Que5 {
    public static void verification(int age){
        if(age>=18){
            System.out.print("You Age Eligible to vote:");
        }
        if(age<18){
            System.out.print("You Age Not Eligible to vote");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age :");
        int age = sc.nextInt();

        verification(age);

    }
    
}
