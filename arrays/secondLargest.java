package arrays;

public class secondLargest {
    public static  int secondLargest(int arr[],int n)
    {
        if(n<2)
        {
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest&&arr[i]!=largest)
            {
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }

    public static void main(String[]args)
    {
        int [] arr ={1,2,4,7,7,5};
        int n = arr.length;
        int res = secondLargest(arr,n);
        System.out.println(res);

    }
    
}
