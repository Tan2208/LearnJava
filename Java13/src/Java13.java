import java.util.Scanner;

public class Java13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a: ");
        float a;
        a = sc.nextFloat();

        System.out.println("a = "+a);
        a += 3;
        System.out.println("a +=3: "+a);
        a -= 4;
        System.out.println("a -=4: "+a);
        a *= 2;
        System.out.println("a *= 2: "+a);
        a /= 3;
        System.out.println("a /= 3: "+a);
        a %= 3;
        System.out.println("a %= 3: "+a);
    }
}
