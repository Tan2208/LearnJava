import java.util.Scanner;

public class Java28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ar[];
        ar = new double[5];
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Enter ar " + i + ": ");
            ar[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        System.out.println("Total: " + sum);
    }
}
