package main;

import java.util.Scanner;
import java.util.Stack;

public class Java62 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        Stack<String> stackString = new Stack<String>();

        System.out.println("Enter: ");
        String s = sc.nextLine();
        for (int i=0;i<s.length();i++)
        {
            stackString.push(s.charAt(i)+"");
        }
        System.out.println("String inverted: ");
        for (int i=0;i<s.length();i++)
        {
            System.out.print(stackString.pop());
        }
        System.out.println();
        Stack<Integer> stack2 = new Stack<Integer>();
        System.out.println("Enter integer: ");
        int x = sc.nextInt();
        while (x>0)
        {
            int temp =x%2;
            System.out.println(temp);
            stack2.push(temp);
            x=x/2;
        }
        System.out.println("Binary number: ");
        int n =stack2.size();
        for(int i=0; i<n;i++)
        {
           System.out.print(stack2.pop());
        }


    }
}
