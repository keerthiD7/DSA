public class fibonacci {
    public static int fibonaccii(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int last = fibonaccii(n-1);
        int slast = fibonaccii(n-2);
        return last+slast;
    }
    public static void main(String[]args)
    {
       int n = 4;

       System.out.println(fibonaccii(n));

    }
    
}
