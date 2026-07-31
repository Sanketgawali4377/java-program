//Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]

/*APPROACH:
 Algorithm: (We are given a 2D matrix of n X m).

1. We will need 4 variables:

 a. row_start - initialized with O.
 b. row_end - initialized with n-1.
 c. column_start - initialized with O.
 d. column_end - initialized with m-1.

2. First of all, we will traverse in the row row start from column start
to column_end and we will increase the row_start with 1 as we have
traversed the starting row.

3. Then we will traverse in the column column_end from row_start to
row_end and decrease the column_end by 1.

4.Then we will traverse in the row row_end from column_end to
column_start and decrease the row_end by 1.

5. Then we will traverse in the column column_start from row_end to
row_start and increase the column_start by 1.

6. We will do the above steps from 2 to 5 until row_start <= row_end
and column_start <= column_end. */

import java.util.Scanner;

public class homework {
    public static void main(String[] args){

    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the rows as you want :");
    int rows = sc.nextInt();
    System.out.print("Enter the columns as you want :");
    int cols = sc.nextInt();

    int arr[][] = new int[rows][cols];

    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            System.out.print("Enter the elements :");
            arr[i][j] = sc.nextInt();
        }
    }

    System.out.println("---------- 2D Array ----------"); 


    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            System.out.println(arr[i][j] + " ");
        }
        System.out.println();
    }

    System.out.print("The Spiral Order are :");

    /*  int n;
    int m;

    int row_start = 0;
    int row_end = n-1;
    int column_start = 0;
    int column_end = m-1;  */

    sc.close();
    }
}
