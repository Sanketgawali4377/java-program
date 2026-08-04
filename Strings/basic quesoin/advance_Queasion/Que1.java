/*Compare two strings using compareTo().
Check whether two strings are equal using equals().
Print the first half of a string.
Print the second half of a string.
Extract the first 5 characters using substring().
Extract the last 4 characters using substring().
Count how many times a particular character appears.
Find the index of the first occurrence of a character (without indexOf()).
Find the index of the last occurrence of a character (without lastIndexOf()).
Check if a string starts with a given character.*/

package advance_Queasion;
import java.util.*;


public class Que1{
    public static void main(String[] args){
        //Compare two strings using compareTo().
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name :");
        String name1 = sc.nextLine();
        System.out.println("Enter Name :");
        String name2 = sc.nextLine();

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("String Are Not Equal");
        }


//Print the first half of a string.
//Print the second half of a string.

        for(int i=0; i<name1.length()/2; i++){
            System.out.println("First Half :" + name1.substring(0, name1.length() / 2)
            );
            
        }
        for(int i=0; i<name1.length()/2; i++){
            System.out.println("Second Half :" + name1.substring(name1.length() / 2 , name1.length()));
            
            
        }
        }

       

    }




