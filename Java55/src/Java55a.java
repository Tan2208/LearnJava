import java.util.Arrays;

public class Java55a {
    public static void main(String[] args)
    {
        Student55 st1=new Student55("Nguyen Lan","Class 1",100,8 );
        Student55 st2=new Student55("Le Tai","Class 2",101,5 );
        Student55 st3=new Student55("Tran Anh","Class 3",102,7 );

        Student55[] a_st = new Student55[]{st1,st2,st3};
        System.out.println("Array: "+ Arrays.toString(a_st));
        //Sort
        Arrays.sort(a_st);
        System.out.println("Array after sort: "+ Arrays.toString(a_st));

        //Search
        System.out.println("Search Tai: "+ Arrays.binarySearch(a_st,st2));


    }
}
