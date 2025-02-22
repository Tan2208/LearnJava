import java.util.Scanner;

public class Java24 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number integer n > 0:");
        n = sc.nextInt();

        String np = "";

        while(n>0){
            np = (n%2) + np;
            n=n/2;
        }
        System.out.println("Binary: "+ np);
    }
}
