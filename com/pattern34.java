package Patterns.com;
import java.util.Scanner;
public class pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int x =i;
			for(int j=6;j>=1;j--)
			{
				if(i<=j)
				{
					System.out.print(x+" ");
					x = x+j;
				}
			}
			System.out.println();
		}

	}

}
