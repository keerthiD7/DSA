package arrays;

public class secondSmallest {

    public static int secondSmallest(int [] arr,int n)
    {
        if(n<2)
        {
            return -1;
        }

        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondSmallest&&arr[i]!=smallest)
            {
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[]args)
    {
        int arr[] ={1,2,4,7,7,5};
        int n = arr.length;
        int sl=secondSmallest(arr, n);
        System.out.println(sl);
    }
    
}
