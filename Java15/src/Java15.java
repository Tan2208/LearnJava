import java.util.Scanner;

public class Java15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = sc.nextInt();

        String rs = (a % 2 == 0) ? "even" : "odd";
        System.out.println("Number is "+rs);
    }
}
