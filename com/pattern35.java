package Patterns.com;
import java.util.Scanner;

public class pattern35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num =10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
				{
					while(true)
					{
						num++;
						int count =0;
						for(int k=1;k<=num;k++)
						{
							if(num%k==0)
							{
								count++;
							}
						}
						if(count==2)
						{
							System.out.print(num);
							break;
						}
					}
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
