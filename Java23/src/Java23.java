import java.util.Scanner;

public class Java23 {
    public static void main(String[] args) {
        int i=1;

        Scanner sc = new Scanner(System.in);

        while(i!=0) {
            System.out.println("Enter number 0 to exit, enter any char or number:");
            i = sc.nextInt();
        }

        i=1;
        while(true) {
            System.out.println(i);
            i++;
            if(i==10) {
                break;
            }
        }

    }
}
