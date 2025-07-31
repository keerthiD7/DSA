package Patterns.com;
import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}

}
