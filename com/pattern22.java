package Patterns.com;
import java.util.Scanner;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =10;
		for(int i=1;i<=n;i++)
		{
			for(int j=4;j>=i;j--)
			{
				
				System.out.print(count+" ");
				count--;
				
			}
			System.out.println();
		}

	}

}
