package conditional_statements;
import java.util.*;
public class switchcase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- claculator -------------");
        System.out.print("enter the first number :");
        int a = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();
        System.out.println("1.addition");
        System.out.println("2.substraction");
        System.out.println("3.multiplay");
        System.out.println("4.division");
        System.out.print("select operation :");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Result :" + (a+b));
                break;
            case 2:
                System.out.println("Result :" + (a-b));
                break;
            case 3:
                System.out.println("Result :" +(a*b));
                break;
            case 4:
                System.out.println("Result :" +(a/b));
                break;

            default:
                System.out.println("invalid input! please enter valid choise");
                break;
        }
        sc.close();
    }
} 