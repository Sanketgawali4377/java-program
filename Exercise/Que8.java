// Two numbers are entered by the user, x and n.
// Write a function to find the value of x raised to the power n.

package Exercise;

import java.util.Scanner;

public class Que8 {

    public static int expo(int x, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = sc.nextInt();

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int ans = expo(x, n);
        System.out.println("Answer = " + ans);

        sc.close();
    }
}