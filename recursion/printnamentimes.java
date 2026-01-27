import java.util.Scanner;
public class printnamentimes {
    static void printName(String name,int count,int N)
    {
        if(count==N)
        {
            return;
        }
        System.out.println(name);
        printName(name,count+1,N);
    }
    public static void main(String[]args)
    {
        printnamentimes p = new printnamentimes();
        int N=5;
        String name="keerthi";
        p.printName(name, 0, N);
    }
    
}
