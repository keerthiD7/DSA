package BasicMath;
import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits=0;
        int temp=n;
        while(temp!=0)
        {
            digits++;
            temp=temp/10;

        }
        temp=n;
        int sum=0;
        while(temp!=0)
        {
            int ld =temp%10;
            int power=1;
            for(int i=1;i<=digits;i++)
            {
                power=power*ld;
            }
            sum= sum+power;
            temp=temp/10;

        }
        if(n==sum)
        {
            System.out.print("ArmstorngNumber");
        }
        else{
            System.out.print("Not a ArmstrongNumber");
        }


    }
    
}
