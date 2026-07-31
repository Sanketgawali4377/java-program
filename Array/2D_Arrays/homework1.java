//For a given matrix of N x M, print its transpose.

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the rows as you want :");
    int N = sc.nextInt();
    System.out.print("Enter the columns as you want :");
    int M = sc.nextInt();

    int arr[][] = new int[N][M];

    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            System.out.print("Enter the elements :");
            arr[i][j] = sc.nextInt();
        }
    }

    System.out.println("---------- 2D Array ----------"); 


     for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("---------- Transpose of Matrix Is ---------- ");

        int temp = N;
        int temp1 = M;

        for(int i=0; i<temp1; i++){
            for(int j=0; j<temp; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
            sc.close();
    
    }
}

