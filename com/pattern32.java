package Patterns.com;

import java.util.Scanner;

public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = 0;
		int star = 9;
		for(int i=1;i<=9;i++)
		{
			for(int a =1;a<=space;a++)
			{
				System.out.print(" ");
			}
			for(int b = 1;b<=star;b++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				star-=2;
				space++;
			}
			else
			{
				star+=2;
				space--;
			}
			System.out.println();
		
		}


	}

}
