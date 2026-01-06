 class PairWithTargetSum{
    static int[] findpair(int[] arr,int target)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int sum = arr[left]+arr[right];
            if(sum==target)
            {
                return new int[]{left,right};
            }
            else if(sum<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[]args)
    {
        int result[]=findpair(new int[]{1,2,3,4,6},6);
        System.out.println(result[0]+" "+result[1]);
    }
}