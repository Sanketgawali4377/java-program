//Write a function which takes in 2 numbers and returns the greater of those two.

package Exercise;

import java.util.Scanner;

public class Que3 {
    public static void greater(int n1,int n2){
        if(n1>n2){
            System.out.print("Grater Value Are :" +n1 );
        }
        if(n1<n2){
            System.out.print("Grater Value Are :" +n2 );
        }
        else{
            System.out.print("Invalid Input !");
        }
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter First Number :");
     int n1 = sc.nextInt();
     System.out.print("Enter First Number :");
     int n2 = sc.nextInt();

     greater(n1,n2);
     sc.close();
    }
    
    
}
