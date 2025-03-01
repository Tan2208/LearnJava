public class Java34 {
    public static void main (String[] args)
    {
        MyDate34 md = new MyDate34(14,1,2025);
        MyDate34 md2 = new MyDate34(24,10,2025);
        MyDate34 md3 = new MyDate34(14,1,2025);

        System.out.println(md);
        System.out.println(md2);
        System.out.println(md3);


        System.out.println("md equal md3: " + md.equals(md3));
        System.out.println("md equal md2: " + md.equals(md2));

        System.out.println("md Hashcode: "+md.hashCode());
        System.out.println("md2 Hashcode: "+md2.hashCode());
        System.out.println("md3 Hashcode: "+md3.hashCode());
    }
}
