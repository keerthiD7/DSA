package arrays;

public class checkifarrayissorted {
    public static boolean sortedornot(int arr[],int n)
    {
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=arr[i-1])
            {

            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args)
    {
        int arr[] ={1,2,1,3,4};
        int n = arr.length;
        boolean sor=sortedornot(arr, n);
        System.out.println(sor);

    }
    
}
