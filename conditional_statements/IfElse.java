package conditional_statements;
import java.util.*;

public class IfElse{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a Number :");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        
    }
   
}