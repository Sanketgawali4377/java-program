/*Find the first and last character of a string.
Reverse a string without using StringBuilder.reverse().
Check whether a string is empty.
Print all characters at even indices.
Print all characters at odd indices.*/



import java.util.Scanner;

public class multiple_basic_que2 {
    public static void main(String[] args){

    //Find the first and last character of a string

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String :");
    String name = sc.nextLine();

    //Find the first and last character of a string.
        System.out.print("first letter :");
        System.out.println(name.charAt(0));


       
        int a = name.length() - 1;
        System.out.println("last letter :" + name.charAt(a));

    //Check whether a string is empty.
    
   if(name.isEmpty()){
    System.out.println("String Is Empty :");
   }else{
    System.out.println("String Not Empty :");
   }

//Print all characters at even indices.
//Print all characters at odd indices
System.out.println("---------- charecter At Even Index ---------");
for(int i=0; i<name.length(); i++){
    if(i%2==0){
         
         System.out.println("Charecter At  :"+ name.charAt(i) + " ");
    }
   }


    for(int i=0; i<name.length(); i++){
       
    if (i%2 != 2){
        System.out.println("Charecter At Odd :"+ name.charAt(i) + " ");
    }
   }
    sc.close();
}
    
}





