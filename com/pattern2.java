package Patterns.com;
import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3&&j==5)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		

	}

}
