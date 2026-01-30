public class reversearray {
    public void reversearrayy(int []arr,int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reversearrayy(arr, start+1, end-1);

    }
    public static void main(String[]args)
    {
        reversearray rev = new reversearray();
        int arr []={10,30,50,70,90};
        rev.reversearrayy(arr, 0, arr.length-1);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
    
}
