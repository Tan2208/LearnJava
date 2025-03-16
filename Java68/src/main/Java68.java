package main;

import java.io.File;
import java.util.Scanner;

public class Java68 {

    File file;

    public Java68(String namefile) {
        this.file =new File(namefile);
    }

    public boolean isCanExecute()
    {
        return this.file.canExecute();
    }

    public boolean isCanRead()
    {
        return this.file.canRead();
    }

    public boolean isCanWrite()
    {
        return this.file.canWrite();
    }

    public void isPath()
    {
        System.out.println(this.file.getPath());
    }

    public void isName()
    {
        System.out.println(this.file.getName());
    }

    public void checkFile(){
        if(this.file.isDirectory())
        {
            System.out.println("Is Folder");
        }
        else if(this.file.isFile()){
            System.out.println("Is File");
        }
    }

    public void printfListFolder()
    {
        if(file.isDirectory())
        {
            System.out.println("Sub-folder: ");
            File[] listf = this.file.listFiles();
            for (File file:listf){
                System.out.println(file.getAbsoluteFile());
            }
            
        } else if (file.isFile()) {
            System.out.println("Is file, not have sub-folder.");
        }
    }

    public void treeFile(){
        this.detailFile(this.file,1);
    }

    public void detailFile(File f, int step){
        for (int i=0;i<step;i++)
        {
            System.out.print("\t");
        }
        System.out.print("|_");
        System.out.println(f.getName());
        if(f.canRead() && f.isDirectory())
        {
            File[] listF = f.listFiles();
            for (File fx :listF){
                detailFile(fx,step+1);
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int lc=0;

        System.out.println("Enter file path:");
        String filename = sc.nextLine();
        Java68 f = new Java68(filename);




        System.out.println("1. Check file can execute.\n"+
                "2. Check file can read.\n"+
                "3. Check file can write.\n"+
                "4. Printf path.\n"+
                "5. Printf name file.\n"+
                "6. Check file is folder or file.\n"+
                "7. Printf list file.\n"+
                "8. Printf file tree.\n"+
                "0. Exit.");
        do {
            System.out.println("Enter number: ");
            lc = sc.nextInt();
            switch (lc)
            {
                case 1:System.out.println(f.isCanExecute());
                    break;
                case 2: System.out.println(f.isCanRead());
                    break;
                case 3: System.out.println(f.isCanWrite());
                    break;
                case 4: f.isPath();
                    break;
                case 5: f.isName();
                    break;
                case 6: f.checkFile();
                    break;
                case 7: f.printfListFolder();
                    break;
                case 8: f.treeFile();
                    break;
                default :
                    break;

            }

        sc.nextLine();
        }while (lc!=0);


    }
}
