/*Print the length of a string.
Print each character of a string using charAt().
Count uppercase and lowercase letters separately.
*/



import java.util.*;

public class multiple_basic_que{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        //Print the length of a string.
        System.out.println(name.length());

  
        //print each character of a string using charAt().
        for(int i=0; i<name.length(); i++){
        System.out.println(name.charAt(i) + " ");
        }

        //Count uppercase and lowercase letters separately.
        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < name.length(); i++)
            {
                char ch = name.charAt(i);

        if (Character.isUpperCase(ch))
        {
            upperCount++;
        } 
        else if (Character.isLowerCase(ch))
            {
                lowerCount++;
            }
}

        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Lowercase letters: " + lowerCount);
    
    sc.close();
           
        }



//find the first and last character of a string.

   
    }






