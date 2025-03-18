package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Java71 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("C://Java//LearnJava//Java71//Text.txt","UTF-8");
            pw.println("Hello world");
            pw.flush();
            Student71 st =new Student71("M01","Nam");
            pw.println(st);
            pw.flush();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}
