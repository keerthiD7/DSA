package Patterns.com;
import java.util.Scanner;

public class pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=2*n-1;i++)
		{
			int star=1;
			if(i<=4)
			{
				star=i;
			}
			else
			{
				star = 2*n-i;
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
