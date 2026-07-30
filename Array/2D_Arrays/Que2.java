// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs

import java.util.Scanner;

public class Que2 {
    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Many Colums You Want :");
        int cols = sc.nextInt();
        System.out.print("Enter How Many Rows You Want :");
        int rows = sc.nextInt();

        int[][] number = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                number [i][j] = sc.nextInt();
            }
        }
        
        
        System.out.println("---------- 2D Array ----------"); 

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

      
        System.out.print("Enter The Number To Search :");
        int x = sc.nextInt();


        boolean found= false;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if( number [i][j] == x){
                    System.out.println("Found at index (" + i + ", " + j + ")");
                    found = true;
                }
              
            }
        }
                if (!found) {
                    System.out.println("Not Found!");
                }
                sc.close();
            }
}
