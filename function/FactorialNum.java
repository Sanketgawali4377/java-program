package function;

import java.util.Scanner;

public class FactorialNum {
    
    public static void printfactorial(int n){
        if(n<0){
        System.out.println("invalid number");
        return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int n = sc.nextInt();
        System.out.print("Answer is :");
        printfactorial(n);
        sc.close();
    }
    
}
