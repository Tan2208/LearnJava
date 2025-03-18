package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Java72 {
    public static void main(String[] args) {
        File f =new File("C://Java//LearnJava//Java72//Text.txt");
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line =null;
            while (true)
            {
                line =br.readLine();
                if(line==null)
                {
                    break;
                }else {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File f1 =new File("C://Java//LearnJava//Java72//Text.txt");

        try {
            List<String> allText =Files.readAllLines(f1.toPath(),StandardCharsets.UTF_8);
            for (String line : allText)
            {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
