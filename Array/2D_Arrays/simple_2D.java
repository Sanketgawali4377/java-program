
import java.util.*;

public class simple_2D {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many columns you want to add : ");
        int cols = sc.nextInt();
        System.out.print("Enter how many rows you want to add : ");
        int rows = sc.nextInt();

        int[][] number = new int[cols][rows];

        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                number[i][j] = sc.nextInt();;
            }
        }


        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}

    

