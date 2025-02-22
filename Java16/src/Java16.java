import java.util.Scanner;

public class Java16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a ,b;
        System.out.println("a = ");
        a = sc.nextDouble();
        System.out.println("b = ");
        b = sc.nextDouble();


        //
        System.out.println("|a| = "+Math.abs(a));
        //
        System.out.println("min(a,b) = "+Math.min(a,b));
        //
        System.out.println("max(a,b) = "+Math.max(a,b));
        //
        System.out.println("Ceil a = "+Math.ceil(a));
        //
        System.out.println("Floor a = "+Math.floor(a));
        //
        System.out.println("Square root a = "+Math.sqrt(a));
    }
}
