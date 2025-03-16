package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Java69 {
    public static void deteleFile(File fx){
        if(fx.isFile())
        {
            System.out.println("Delete: "+fx.getAbsoluteFile());
            fx.delete();
        } else if (fx.isDirectory()) {
            File[] lf = fx.listFiles();
            for (File f:lf )
            {
                deteleFile(f);
            }
            System.out.println("Delete: "+fx.getAbsoluteFile());
            fx.delete();
        }
    }

    public static void deteleFile2(Path fath){
        if(fath.toFile().isFile())
        {
            System.out.println("Delete: "+fath.toFile().getAbsoluteFile());
            try {
                Files.deleteIfExists(fath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (fath.toFile().isDirectory()) {
            File[] lf = fath.toFile().listFiles();
            for (File f:lf )
            {
                deteleFile2(f.toPath());
            }
            System.out.println("Delete: "+fath.toFile().getAbsoluteFile());
            try {
                Files.deleteIfExists(fath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        File f01 =new File("C://Java//LearnJava//Java69//F01");
        File f02 = new File("C://Java//LearnJava//Java69//F02");
        File ft = new File("C://Java//LearnJava//Java69//Test01.txt");

        /*
        f01.delete();
        System.out.print(f01.delete());
        f01.deleteOnExit();
        f02.deleteOnExit();
        ft.deleteOnExit();
        */
        //Java69.deteleFile(f01);
        Path p01 =f01.toPath();
        Path p02 = f02.toPath();
        Path pt =ft.toPath();


        try {
            //Files.deleteIfExists(p01);
            Files.deleteIfExists(p02);
            Files.deleteIfExists(pt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Java69.deteleFile2(p01);


    }

}
