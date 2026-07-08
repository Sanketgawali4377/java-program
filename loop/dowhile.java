package loop;

import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choise;

        do {

            System.out.println("Enter Number From 0 To 1:");
            choise = sc.nextInt();

            if (choise == 1) {

                System.out.println("Enter Marks From 0 To 100:");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("Good Marks");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("Also Good Marks");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well because marks don't matter but our effort does.");
                } else {
                    System.out.println("Invalid Marks");
                }
            }

        } while (choise != 0);

        System.out.println("Program is ended");
        sc.close();
    }
}
