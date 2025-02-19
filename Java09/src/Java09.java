import java.util.Scanner;

public class Java09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your ID: ");
        Long id = sc.nextLong();
        System.out.println("Enter your average ecore : ");
        float average = sc.nextFloat();

        System.out.println("-------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Average: " + average);
    }
}
