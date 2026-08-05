/*Extract the first 5 characters using substring().
Extract the last 4 characters using substring().
Print the first half of a string.
Print the second half of a string.
Compare two strings using compareTo().
Check whether two strings are equal using equals().


Count how many times a particular character appears.
Find the index of the first occurrence of a character (without indexOf()).
Find the index of the last occurrence of a character (without lastIndexOf()).
Check if a string starts with a given character.*/

package advance_Queasion;
import java.util.*;


public class Que1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name 1: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Name 2: ");
        String name2 = sc.nextLine();

        // Compare two strings
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // First half
        String firstHalf = name1.substring(0, name1.length() / 2);
        System.out.println("First Half: " + firstHalf);

        // Second half
        String secondHalf = name1.substring(name1.length() / 2);
        System.out.println("Second Half: " + secondHalf);



        //Extract the first 5 characters using substring().
        //Extract the last 4 characters using substring().

        System.out.println("First Five Charecter Of First String: "+ name1.substring(0,5));
        
        System.out.println("First Four Charecter Of First String: " + name1.substring(0,4));
        
        System.out.println("First Five Charecter Of First String: " + name2.substring(0,5));

        System.out.println("First Four Charecter Of First String: " + name2.substring(0,4));


        //Check whether two strings are equal using equals().
       if(name1.equals(name2)){
        System.out.println("String Are Equal: ");
       }else{
        System.out.println("String Are Not Equal");
       }

        //Count how many times a particular character appears.
       System.out.print("Enter The Element: ");
        char a = sc.next().charAt(0);

        int count =0;
        for(int i=0; i<name1.length(); i++){
            if(a==name1.charAt(i)){
                count++;
            }
            
        }
            System.out.println("count :"+ count);
        
        sc.close();
    }
}