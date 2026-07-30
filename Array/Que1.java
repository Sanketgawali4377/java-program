package Array;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Size :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter The Numbers In Array :");
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter Number for Search :");
        int search = sc.nextInt();

    for(int i=0; i<size; i++){
      if(arr[i]==search){
        System.out.print("number found at array at " + i + " position");
      }
 
    }
}
}
