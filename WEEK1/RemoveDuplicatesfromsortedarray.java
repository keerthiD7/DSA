public class RemoveDuplicatesfromsortedarray {
    public  static int removeDuplicates(int []numbers)
    {
        int slow=0;
        for(int fast=1;fast<numbers.length;fast++)
        {
            if(numbers[fast]!=numbers[slow])
            {
                slow++;
                numbers[slow]=numbers[fast];
            }

        }
        return slow+1;
    }
    public static void main(String[]args)
    {
        int [] numbers={1,1,2,2,3};
        int k = removeDuplicates(numbers);
        System.out.println("Number of unique elements:"+k);
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<k;i++)
        {
            System.out.print(numbers[i]+" ");
        }
    }
    
}
