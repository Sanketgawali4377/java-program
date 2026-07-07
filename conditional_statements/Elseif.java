package conditional_statements;

import java.util.*;

public class Elseif {
   public static void main(String args[]){ 
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a");
    int a = sc.nextInt();
    System.out.print("enter b");
    int b = sc.nextInt();
    if (a==b){  
        System.out.println("a is equal to b");
    }
    else{
        if(a>b){
            System.out.println("a is bigger than b");
        }
    else{
        if(a<b){
            System.out.println("a is smaller than b");
        }
    }
    sc.close();
}
}
}