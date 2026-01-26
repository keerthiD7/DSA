import java.util.Scanner;
public class pattern19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            
            char ch=(char)('A'+i-1);
            for(int j=i;j<=n;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    
}
