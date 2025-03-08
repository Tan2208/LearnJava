public class Java50 {
    public static void main (String[] args)
    {
        String s1 = "hello";
        String s2 = "HELLO";
        String s3 = "hello";

        // Function equals
        System.out.println("S1 equals s2: "+s1.equals(s2));
        System.out.println("S1 equals s3: "+s1.equals(s3));
        System.out.println("-------------");
        // Function equalsIgnoreCase
        System.out.println("S1 equalsIgnoreCase s2: "+s1.equalsIgnoreCase(s2));
        System.out.println("S1 equalsIgnoreCase s3: "+s1.equalsIgnoreCase(s3));
        System.out.println("-------------");
        // Function compareTo
        String st1 = "Nguyễn A";
        String st2 = "Nguyễn B";
        String st3 = "Nguyễn";
        String st4 = "Nguyễn b";

        System.out.println("St1 compareTo st2: "+st1.compareTo(st2));
        System.out.println("St1 compareTo st3: "+st1.compareTo(st3));
        System.out.println("St2 compareTo st4: "+st2.compareTo(st4));
        System.out.println("-------------");
        // Function compareToIgnoreCase

        System.out.println("St1 compareTo st2: "+st1.compareToIgnoreCase(st2));
        System.out.println("St1 compareTo st3: "+st1.compareToIgnoreCase(st3));
        System.out.println("St2 compareTo st4: "+st2.compareToIgnoreCase(st4));
        System.out.println("-------------");
        // Function regionMatches
        String r1 ="Hello.com";
        String r2 ="Hello";
        boolean check = r1.regionMatches(0,r2,0,5);
        System.out.println(check);
        System.out.println("-------------");

        // Function startWith
        String phone = "0908475251";
        System.out.println(phone.startsWith("090"));
        System.out.println(phone.startsWith("091"));
        System.out.println("-------------");

        // Function endWith
        String file = "Java.JPG";
        String file2 = "Java.PDF";

        if(file.endsWith(".JPG"))
        {
            System.out.println("File image");
        }else if(file.endsWith(".PDF"))
        {
            System.out.println("File PDF");
        }

        if(file2.endsWith(".JPG"))
        {
            System.out.println("File 2 image");
        }else if(file2.endsWith(".PDF"))
        {
            System.out.println("File 2 PDF");
        }



    }
}
