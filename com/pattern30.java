package Patterns.com;
import java.util.Scanner;

public class pattern30 {

	public static void main(String[] args) {
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
			if(i<=4)
			{
				space--;
				star++;
			}
			else
			{
				star--;
				space++;
			}
			System.out.println();
		}

	}

}
