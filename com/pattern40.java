package Patterns.com;
import java.util.Scanner;

public class pattern40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
		

	}

}
