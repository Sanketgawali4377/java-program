package function;

import java.util.Scanner;

public class OddOrEven {
    public static void check(int n){

        if( n%2==0){
            System.out.println("Number is even");
         }
         else{
                System.out.print("Number Is odd");
            }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter The Number :");
            int n = sc.nextInt();
            check(n);
            sc.close();
            
        }
    }
    

