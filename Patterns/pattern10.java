import java.util.Scanner;
public class pattern10 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=1;
        for(int i=1;i<=n;i++)
        {
            for(int b=1;b<=star;b++)
            {
                System.out.print("*");
            }
            if(i<=4)
            {
                star++;
            }
            else{
                star--;
            }
            System.out.println();
        }
    }
    
}
