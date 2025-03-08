public class CalculatorMain implements CalculatorInterface,SortInterface{
    @Override
    public double sum(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

    @Override
    public double mul(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) {
        return a/b;
    }

    @Override
    public void AscendingSort(double[] arr) {
        int n= arr.length;
        double key;
        int i,j;
        for(i=1;i<n;i++)
        {
            key = arr[i];
            j=i-1;
            while (j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]= key;
        }
    }

    @Override
    public void DescendingSort(double[] arr) {
        int n=arr.length;
        int i,j,min;
        for(i=0;i<n;i++)
        {
            min = i;
            for (j=i;j<n;j++)
            {
                if(arr[j]>arr[min])
                    min=j;
            }
            double temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
