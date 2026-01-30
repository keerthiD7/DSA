import java.util.Scanner;

public class smallestelement {
    static int findSmallest(int arr[],int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        int min=findSmallest(arr, n-1);
        if(arr[n-1]<min)
        {
            return arr[n-1];
        }else{
            return min;
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
        int smallest = findSmallest(arr, n);
        System.out.println(smallest);
    }
    
    
}
