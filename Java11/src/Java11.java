import java.util.Scanner;

public class Java11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("a=");
        a = sc.nextInt();
        System.out.println("b=");
        b = sc.nextInt();

        int sum=a+b;
        System.out.println("a + b= "+sum);

        int sub=a-b;
        System.out.println("a - b = "+sub);

        int mul=a*b;
        System.out.println("a * b= "+mul);

        float div=(float)a/b;
        System.out.println("a / b = "+div);

        int mod=a%b;
        System.out.println("a % b = "+mod);
    }
}
