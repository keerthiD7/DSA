public class printNto1 {
    static void printnto1(int n){
        if(n<1)
        {

            return;
        }
        System.out.println(n);
        printnto1(n-1);

    }
    public static void main(String[]args)
    {
        printnto1(5);
    }
}
