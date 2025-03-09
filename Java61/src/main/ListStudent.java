package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent {
    private ArrayList<Student> list;

    public ListStudent(ArrayList<Student> list) {
        this.list = list;
    }

    public ListStudent() {
        this.list = new ArrayList<Student>();
    }




    public  void addStudent(Student st)
    {
        this.list.add(st);
    }


    public  void printfListStudent()
    {
        for (Student student: list){
            System.out.println(student);
        }
    }

    public boolean checkempty(){
        return this.list.isEmpty();
    }

    public int getquantity(){
        return this.list.size();
    }

    public void isempty(){
        this.list.removeAll(list);
    }

    public boolean  checkStudent(Student st)
    {
        return this.list.contains(st);
    }

    public boolean  deleteStudent(Student st)
    {
        return this.list.remove(st);
    }

    public void  searchStudent(String name)
    {
        for(Student st : list)
        {
            if(st.getFullName().indexOf(name)>=0){
                System.out.println(st);
            }
        }
    }


    public void Sort(){
        Collections.sort(this.list, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if(st1.getAvgscore()<st2.getAvgscore())
                    return 1;
                else if(st1.getAvgscore()>st2.getAvgscore()){
                    return -1;
                }
                else
                    return 0;
            }
        });
    }
}
