public class Java51 {
    public static void main(String[] args)
    {
        String s1 = "Hello world, Hello";
        String s2 = "Hello";
        String s3 = "Hello 123";
        char c1 = 'r';
        //Function indexOf : search
        System.out.println("Position of s2 in s1: "+ s1.indexOf(s2));
        System.out.println("Position of s3 in s1: "+ s1.indexOf(s3));

        System.out.println("Position of s2 in s1: "+ s1.indexOf(s2,1));

        System.out.println("Position of c2 in s1: "+ s1.indexOf(c1));
        System.out.println("Position of c2 in s1: "+ s1.indexOf(c1,9));
        System.out.println("--------------");
        //Function lastIndexOf : right -> left
        System.out.println("Position of s2 in s1: "+ s1.lastIndexOf(s2));

    }
}
