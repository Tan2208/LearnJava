import java.util.Arrays;

public class Java56 {
    public static void main(String[] args)
    {
        String s = "Hello world, hello people";
        String[] a =s.split(" ");
        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));

        String s1 = "Hello world, hello people. The world is big!";
        String[] c = s1.split("[.,]");
        System.out.println(Arrays.toString(c));

        String s2 = "Trần Duy Tân";
        String[] d = s2.split(" ");
        System.out.println("Name: "+d[d.length-1]);

    }
}
