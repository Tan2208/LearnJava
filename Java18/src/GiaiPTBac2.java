import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c,x1,x2,delta;

        System.out.println("a = ");
        a = sc.nextDouble();
        System.out.println("b = ");
        b = sc.nextDouble();
        System.out.println("c = ");
        c = sc.nextDouble();

        delta = Math.pow(b,2) - 4*a*c;

        if(a==0)
        {
            System.out.println("a phải khác 0");
        }else {
            if (delta < 0) {
                System.out.println("PT vô nghiệm ");
            } else if (delta == 0) {
                System.out.println("PT có nghiệm kép x1=x2= " + (-b / (2 * a)));
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("PT có 2 nghiệm");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }


    }
}
