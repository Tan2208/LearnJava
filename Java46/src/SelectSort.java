public class SelectSort implements SortInterface{
    @Override
    public void AscendingSort(double[] arr) {
        int n=arr.length;
        int i,j,min;
        for(i=0;i<n;i++)
        {
            min = i;
            for (j=i;j<n;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            double temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
