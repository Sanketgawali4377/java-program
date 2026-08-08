import java.util.Scanner;

public class Update_bit {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n =5;
        int pos = 1;
        int bit_mask = 1<<pos;
        if(oper == 1){
            int newbit = bit_mask | n ;
            System.out.println(newbit);
        }else{
            int newbitmask = ~(bit_mask);
            int newbit = newbitmask & n;
            System.out.print(newbit);
        }
        sc.close();
        }
    }

