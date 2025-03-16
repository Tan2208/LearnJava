package main;

import java.io.File;
import java.io.IOException;

public class Java67 {
    public static void main(String[] args) {
        //Check Folder
        File folder =new File("C://Java//LearnJava//Java67");
        File folder1 =new File("C://Java//LearnJava//Java99");
        System.out.println("Folder is exists: "+folder.exists());
        System.out.println("Folder is exists: "+folder1.exists());


        //Create Folder
        File f1 = new File("C://Java//LearnJava//Java67/Directory_1");
        f1.mkdir();
        File f2 = new File("C://Java//LearnJava//Java67/Directory_1/Directory_2/Directory_3");
        f2.mkdirs();

        //Create File
        File file1 = new File("C://Java//LearnJava//Java67/Directory_1/Exp_1.txt");
        File file2 = new File("C://Java//LearnJava//Java67/Directory_1/Exp_2.exe");
        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
