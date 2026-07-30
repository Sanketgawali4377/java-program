package Array;

import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int size = sc.nextInt();


        int arr[] = new int[size];
        
        for(int i=0 ; i<size; i++){
            System.out.print(arr[i]);
        }   
        sc.close();
    }
    
}
