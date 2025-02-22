import java.util.Scanner;

public class GiaiPT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // PTNB: ax+b=0
        double a,b,x;

        System.out.println("a = ");
        a = sc.nextDouble();
        System.out.println("b = ");
        b = sc.nextDouble();

        if(a==0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else{
            System.out.println("x = "+ (-b/a));
        }



    }
}
