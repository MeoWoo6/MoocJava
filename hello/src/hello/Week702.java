package hello;

import java.util.Scanner;

public class Week702 {
	
	public static boolean isPerfect(int a)
	{
		boolean Perfect = false;
		int sum = 0;
		for(int i=1; i<a; i++)
		{
			if(a%i==0)
			{
				sum += i;
			}
		}
		if(sum == a)
		{
			Perfect = true;
		}
		return Perfect;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print all Perfect Number in [n, m]
		// 1<=n<m<1000, n and m are integers
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for(int i=n; i<=m; i++)
		{
			if(isPerfect(i))
			{
				System.out.print(i+" ");
			}
		}

	}

}
