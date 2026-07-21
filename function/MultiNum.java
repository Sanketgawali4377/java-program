package function;

import java.util.Scanner;

public class MultiNum {
    public static int calculate(int a, int b){

        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Value :");
            int a = sc.nextInt();
        System.out.print("Enter The Second Value :");  
            int b = sc.nextInt();
        
    System.out.println("multiply of two number :" + calculate( a, b));
    sc.close();
    
    }
}
