package hello;

import java.util.Scanner;

public class Week302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x;
		int y;
		int even = 0;
		int sum = 0;
		int n = 0;
		x = in.nextInt();
		do {
			y = x % 10;
			if((y+n+1)%2 == 0)
			{
				even = 1;
			}
			else
			{
				even = 0;
			}
			x /= 10;
			sum += (int)Math.pow(2, n)*even;
			n += 1;
		} while(x>0);
		
		System.out.println(sum);
	
	}

}
