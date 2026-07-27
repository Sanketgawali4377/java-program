//Write a program to enter the numbers till the user wants and at the end it should display 
// the count of positive, negative and zeros entered. 


package Exercise;

import java.util.Scanner;

public class Que7 {
    public static void count(int n){
        Scanner sc = new Scanner(System.in);
        int positive =0;
        int negative =0;
        int zero =0;

        for(int i=1; i<=n; i++)
        {
             System.out.print("Enter Number " + i + " : ");
            int number = sc.nextInt();


             if (number > 0) {
                positive++;
            } else if (number == 0) {
                zero++;
            } else {
                negative++;
            }
        }
             System.out.println("\nPositive Numbers : " + positive);
            System.out.println("Negative Numbers : " + negative);
            System.out.println("Zeroes : " + zero);


        sc.close();
        
           
    }

        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Many Time You Want To Give Inputs :");
        int n = sc.nextInt();
      
       count(n);
       
        sc.close();
    }
    
}
