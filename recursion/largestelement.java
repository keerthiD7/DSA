import java.util.Scanner;
public class largestelement {
    static int findLargest(int arr[],int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        int max=findLargest(arr, n-1);
        if(arr[n-1]>max)
        {
            return arr[n-1];
        }else{
            return max;
        }
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int largest = findLargest(arr, n);
        System.out.println(largest);
    }
    
}
