//Enter 3 numbers from the user & make a function to print their average.

package Exercise;
import java.util.Scanner;

public class Que1{
    public static int average(int a, int b, int c){
    int sum;
    sum = a + b + c;
    int avg = sum / 3 ;
    return avg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter third Number: ");
        int c = sc.nextInt();

        int result = average(a, b, c);

        System.out.println("Average = " + result);

        sc.close();
    }
        
}
 
    

