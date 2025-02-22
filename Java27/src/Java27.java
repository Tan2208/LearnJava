import java.util.Scanner;

public class Java27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=0;
        try {
            System.out.println("Enter number integer n: ");
            n = sc.nextInt();
        }catch (Exception e){
            System.out.println("Incorrect input");
        }finally {
            System.out.println("Finally!!!");
        }

        System.out.println("n= "+n);
        System.out.println("End");
    }
}
