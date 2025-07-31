package Patterns.com;
import java.util.Scanner;

public class pattern37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==4||i+j==5||j-i==3)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
