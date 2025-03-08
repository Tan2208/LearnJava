import java.util.Scanner;

public class Java49 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter string: ");
        String s =  sc.nextLine();

        System.out.println("Length of string: "+s.length());
        int lg = s.length();

        for (int i=0;i<lg;i++)
        {
            System.out.println("Position "+i+ " is: "+s.charAt(i));
        }

        char[] arrChar= new char[10];
        s.getChars(2,5,arrChar,0);
        for (int i=0;i< arrChar.length;i++)
        {
            System.out.println("Value of arr "+i+ " is: "+arrChar[i]);
        }

        byte[] arrayBytes = s.getBytes();
        for(byte b : arrayBytes)
        {
            System.out.println(b);
        }
    }
}
