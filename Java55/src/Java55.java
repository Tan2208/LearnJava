import java.util.Arrays;

public class Java55 {
    public static int[] reverse(int[] x)
    {
        int[] rs =new int[x.length];
        int index=0;
        for(int i=x.length-1;i>=0;i--)
        {
            rs[index]=x[i];
            index++;
        }
        return rs;
    }
    public static void main(String[] args)
    {
        int[] a = new int[]{2,6,1,9,7,3};
        int[] b = new int[10];

        //
        System.out.println("a[]: "+ Arrays.toString(a));
        //Ascending Sort
        Arrays.sort(a);
        System.out.println("a[] sort: "+Arrays.toString(a));

        //Search
        System.out.println(Arrays.binarySearch(a,6));
        System.out.println(Arrays.binarySearch(a,-1));
        //
        Arrays.fill(b,5);
        System.out.println("b[] after fill:"+Arrays.toString(b));
        //Descending Sort
        Arrays.sort(a);
        a = reverse(a);
        System.out.println("a[] descending sort: "+Arrays.toString(a));


    }

}
