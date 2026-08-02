//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

package Strings;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String[] arr = new String[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.next();
            
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        int totLength = 0;

        for (int i = 0; i < size; i++) {
            totLength += arr[i].length();
        }

        System.out.println("Combined Length = " + totLength);
        
        sc.close();
    }
    
}
