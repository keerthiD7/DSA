package Arrays.com;
import java.util.Scanner;

public class SmallestEelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				arr[i]=min;
			}
		}
		System.out.print(min);

	}

}
