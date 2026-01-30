import java.util.Scanner;
public class primeornot {
    static boolean isPrime(int n,int i)
    {
        if(n<=2)
        {
            return(n==2);
        }
        if(n%i==0)
        {
            return false;
        }
        if(i*i>n)
        {
            return true;
        }
        return isPrime(n,i+1);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num,2))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
