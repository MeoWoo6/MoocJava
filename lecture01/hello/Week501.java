package hello;

import java.util.Scanner;

public class Week501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] poly = new int[2][10];
		int power;
		int coef;
		Scanner in = new Scanner(System.in);
		power = in.nextInt();
		coef = in.nextInt();
		int max1 = power;
		int max2 = 0;
		boolean first = true;
		boolean second = false;
		//Read coefficients
		while(first||second)
		{
			if(first)
			{
				poly[0][power]=coef;
			}
			if(second)
			{
				poly[1][power]=coef;
			}
			if(first && power==0)
			{
				first = false;
				second = true;
				power = in.nextInt();
				coef = in.nextInt();
				max2 = power;
				continue;
			}
			if(second && power==0)
			{
				second = false;
				break;
			}
			power = in.nextInt();
			coef = in.nextInt();
		}
		//Calculate the sum of coefficients
		int max;//the highest order of the two polynomials
		int max0;//non zero highest order in the sum of the two
		if(max1>max2)
		{
			max = max1;
		}
		else
		{
			max = max2;
		}
		max0 = max;
		
		int[] sum_coef = new int[max+1];
		boolean flag = true;
		for(int i=max; i>=0 && flag;i--)
		{
			sum_coef[i] = poly[0][i] + poly[1][i];
			if(flag && sum_coef[i]==0)
			{
				max0 -= 1;
				continue;
			}
			flag = false;
			System.out.print(sum_coef[i]+"x"+i);
		}
		for(int i=max0-1; i>=0; i--)
		{
			sum_coef[i] = poly[0][i] + poly[1][i];
			if(sum_coef[i]>0 && i>1)
			{
				System.out.print("+"+sum_coef[i]+"x"+i);
			}
			else if (sum_coef[i]<0 && i>1)
			{
				System.out.print(sum_coef[i]+"x"+i);
			}
			else if (sum_coef[i]>0 && i==1)
			{
				System.out.print("+"+sum_coef[i]+"x");
			}
			else if (sum_coef[i]<0 && i==1)
			{
				System.out.print(sum_coef[i]+"x");
			}
			else if (sum_coef[i]>0 && i==0)
			{
				System.out.print("+"+sum_coef[i]);
			}
			else if (sum_coef[i]<0 && i==0)
			{
				System.out.print(sum_coef[i]);
			}
			else
			{
				continue;
			}
		}

	}

}
