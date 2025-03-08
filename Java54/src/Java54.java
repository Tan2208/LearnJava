public class Java54 {
    public static void main(String[] args)
    {
        Student54 st1=new Student54("Nguyen Lan","Class 1",100,8 );
        Student54 st2=new Student54("Le Tai","Class 2",101,5 );
        Student54 st3=new Student54("Tran Anh","Class 3",102,7 );
        System.out.println(st1.compareTo(st2));

        System.out.println(st2.compareTo(st3));
    }
}
