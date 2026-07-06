import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter redius :");
       int radius = sc.nextInt();
       double area = 3.14 * radius * radius;
       System.out.println("area =" +area);
       sc.close() ;
    }
}
