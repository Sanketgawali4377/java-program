
//Write a function to print the sum of all odd numbers from 1 to n.

package Exercise;

import java.util.Scanner;

public class Que2 {
    public static int sum(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
        if(i%2==1){
          sum = sum + i;
        }
        
    }
    return sum;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();

        int Answer = sum(n);
        System.out.print("answer :" + Answer);
        sc.close();
    }
    
}
