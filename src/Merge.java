public class Merge
{
    public void mergeSort(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }
    public void mergeSortHelper(int[] arr,int left, int right, int[] temp)
    {
        if(left<right)
        {
            int mid = (left+right) /2;
            mergeSortHelper(arr, left, right, temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr, left, mid, right, temp);
        }
    }
    public void merge(int[] arr, int left, int mid, int right, int[] temp)
    {
        int a = left;
        int b= mid +1;
        int c = left;
        while(a<=mid && b<=right)
        {
            if(arr[a]<arr[b])
            {
                temp[c] = arr[a];
                a++;
            }
            else
            {
                temp[c] = arr[b];
                b++;
            }
            c++;
        }

        while(a<=mid)
        {
            temp[c] = arr[a];
            a++;
            c++;
        }

        while(b<=right)
        {
            temp[c] = arr[a];
            b++;
            c++;
        }
        for(int d = left;d<=right;d++)
        {
            arr[d] = temp[d];
        }
    }
}
