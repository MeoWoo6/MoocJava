package hello;

import java.util.Scanner;

public class Week402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int count=0;
		boolean neg = false;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		int ogx = x;
		do
		{
			x /= 10;
			count += 1;
		} while(x!=0);
		
		String [] pinyin = new String [count];
		if(ogx<0)
		{
			ogx = -ogx;
			neg = true;
		}

		for(int i=0; i<count; i++)
		{
			int y = ogx%10;
			ogx = ogx/10;
			switch(y)
			{
			case(0):
				pinyin[i] = "ling";
			case(1):
				pinyin[i] = "yi";
				break;
			case(2):
				pinyin[i] = "er";
				break;
			case(3):
				pinyin[i] = "san";
				break;
			case(4):
				pinyin[i] = "si";
				break;
			case(5):
				pinyin[i] = "wu";
				break;
			case(6):
				pinyin[i] = "liu";
				break;
			case(7):
				pinyin[i] = "qi";
				break;
			case(8):
				pinyin[i] = "ba";
				break;
			case(9):
				pinyin[i] = "jiu";
				break;
			}
		}
		for (int j=count-1; j>=0; j--)
		{
			if(neg)
			{
				System.out.print("fu ");
				neg = false;
			}
			System.out.print(pinyin[j]+" ");
		}

	}

}
