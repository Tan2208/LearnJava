package test;

import main74.ListStudent;
import main74.Student;

import java.io.File;
import java.util.Scanner;

public class Java74 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        ListStudent lst=new ListStudent();
        int sl =0;
        do{
            System.out.println("----------");
            System.out.println("1. Add a student.\n"+
            "2. Print list.\n"+
            "3. Check empty list.\n"+
            "4. Get quantity in list.\n"+
            "5. Make empty list.\n"+
            "6. Check student is exists, with id.\n"+
            "7. Delete student with id.\n"+
            "8. Search student with Name.\n"+
            "9. Print list student is average score form high to low.\n" +
                    "10.Save file.\n" +
                    "11. Read file.\n"+
            "0. Exit");

            sl = sc.nextInt();
            sc.nextLine();
            if(sl==1)
            {
                System.out.println("Enter id: "); String id=sc.nextLine();
                System.out.println("Enter full name: "); String fullname=sc.nextLine();
                System.out.println("Enter year of birth: "); int yob=sc.nextInt();
                System.out.println("Enter average score: "); Double avgscore=sc.nextDouble();
                Student st = new Student(id,fullname,yob,avgscore);
                lst.addStudent(st);




            }else if(sl==2){
                lst.printfListStudent();
            }else if(sl==3){
                System.out.println("List is empty: "+lst.checkempty());
            } else if (sl==4) {
                System.out.println("Number of students: "+lst.getquantity());
            } else if (sl==5) {
                lst.isempty();
            } else if (sl==6) {
                System.out.println("Enter id: "); String id =sc.nextLine();
                Student st = new Student(id);
                System.out.println("Student is exits: "+lst.checkStudent(st));
            } else if (sl==7) {
                System.out.println("Enter id: "); String id =sc.nextLine();
                Student st = new Student(id);
                System.out.println("Student is exits: "+lst.deleteStudent(st));
            } else if (sl==8) {
                System.out.println("Enter full name: "); String fullname=sc.nextLine();
                lst.searchStudent(fullname);
            } else if (sl==9) {
                lst.Sort();
                lst.printfListStudent();
            }else if (sl==10) {
                System.out.println("Enter name file: ");
                String namef = sc.nextLine();
                File f =new File(namef);
                lst.overwrite(f);
            }else if (sl==11) {
                System.out.println("Enter name file: ");
                String namefs = sc.nextLine();
                File f =new File(namefs);
                lst.readfile(f);
            }

        }while(sl!=0);
    }
}
//C:/Java/LearnJava/Java74/Text.txt