package Patterns.com;
import java.util.Scanner;

public class pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = 4;
		int star = 1;
		for(int i=1;i<=n;i++)
		{
			for(int a=1;a<=space;a++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=star;b++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star+=2;
		}
	}

}
