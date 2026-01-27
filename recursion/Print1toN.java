public class Print1toN {
    static void print1ton(int current,int n)
    {
        if(current>n)
        {
            return;
        }
        
        System.out.println(current);
        print1ton(current+1,n);
        
    }
    public static void main(String[]args)
    {
        Print1toN p= new Print1toN();
        int n=10;
        p.print1ton(1,n);
    }
    
}
