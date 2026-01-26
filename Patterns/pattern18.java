import java.util.Scanner;
public class pattern18 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            ch-=2;
            for(int j=1;j<i;j++)
            {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
    
}
