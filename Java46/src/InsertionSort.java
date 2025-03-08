public class InsertionSort implements SortInterface{
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
        int n= arr.length;
        double key;
        int i,j;
        for(i=1;i<n;i++)
        {
            key = arr[i];
            j=i-1;
            while (j>=0 && arr[j]<key)
            {
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]= key;
        }
    }
}
