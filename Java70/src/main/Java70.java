package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Java70 {

    public static void copyAll(File f1, File f2)
    {
        try {
            Files.copy(f1.toPath(),f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(f1.isDirectory())
        {
            File[] fx= f1.listFiles();
            for(File f:fx){
                File fnew=new File(f2.getAbsoluteFile()+"/"+f.getName());
                copyAll(f,fnew);
            }
        }
    }



    public static void main(String[] args) {
        File f0 = new File("C://Java//LearnJava//Java70//Text01.txt");
        File f1 = new File("C://Java//LearnJava//Java70//Text02.txt");
        File f2 = new File("C://Java//LearnJava//Java70//Text01new.txt");
        //Change name file
        //f0.renameTo(f1);

//        try {
//            Files.move(f1.toPath(),f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //Move file

        File f2new= new File("C://Java//LearnJava//Java70//F0//Text01new.txt");
//        try {
//            Files.move(f2.toPath(),f2new.toPath(),StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Copy File

        File f_0= new File("C://Java//LearnJava//Java70//F0");
        File f_0Copy= new File("C://Java//LearnJava//Java70//F0Copy");

        try {
            Files.copy(f_0.toPath(),f_0Copy.toPath(),StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Java70.copyAll(f_0,f_0Copy);

    }
}
