import java.util.Arrays;

public class Java53 {
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3};

        //Copy array
        int[] arr1_a = arr1;
        arr1_a[0]=10;
        System.out.println("Array 1: "+ Arrays.toString(arr1));
        System.out.println("Array 1a: "+ Arrays.toString(arr1_a));
        //Copy array - use clone()
        int[] arr1_b = arr1.clone();
        arr1_b[0]=5;
        System.out.println("Array 1b: "+ Arrays.toString(arr1_b));
        //Copy array - System.arrayCopy
        int[] arr1_c = new int[arr1.length];
        System.arraycopy(arr1,0,arr1_c,0,arr1.length);
        arr1_c[0]=15;
        System.out.println("Array 1c: "+ Arrays.toString(arr1_c));
    }
}
