public class Java46 {
    public static void main(String[] args)
    {
        Casio570FX ca = new Casio570FX();
        VinaCal500 vc = new VinaCal500();

        System.out.println("5+3= "+ca.sum(5,3));
        System.out.println("5-3= "+vc.sub(5,3));
        System.out.println("5*3= "+ca.mul(5,3));
        System.out.println("5/3= "+vc.div(5,3));

        System.out.println("------");

        double[] arr = new double[]{2,7,5,3,8};
        double[] arr2 = new double[]{1,9,4,7,4};
        InsertionSort is =  new InsertionSort();
        SelectSort ss = new SelectSort();

        is.AscendingSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        ss.DescendingSort(arr2);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("---------");


        double[] arr3 = new double[]{6,7,3,1,4};
        CalculatorMain cm = new CalculatorMain();

        System.out.println("5+3= "+cm.sum(5,3));
        cm.AscendingSort(arr3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }



    }



}
