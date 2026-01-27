public class sumofnnumbers {
    public int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);

    }
    public static void main(String[]args)
    {
        sumofnnumbers sol= new sumofnnumbers();
        int n =5;
        int result = sol.sum(n);
        System.out.println(result);
    }
    
}
