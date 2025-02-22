import java.util.Scanner;

public class Java14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("a = ");
        a = sc.nextInt();
        System.out.println("b = ");
        b = sc.nextInt();

        System.out.println("--------------");
        System.out.println(+a+"="+b+":"+(a==b));
        System.out.println(+a+"!="+b+":"+(a!=b));
        System.out.println(+a+">"+b+":"+(a>b));
        System.out.println(+a+"<"+b+":"+(a<b));
        System.out.println(+a+"<="+b+":"+(a<=b));
        System.out.println(+a+">="+b+":"+(a>=b));
        System.out.println("Cả 2 số là chẳn: "+(a%2==0 && b%2==0));
        System.out.println("Có ít nhất 1 số là chẵn: "+(a%2==0 || b%2==0));

    }
}
