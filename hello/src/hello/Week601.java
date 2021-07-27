package hello;

import java.util.Scanner;

public class Week601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s;
		boolean endflag = false;
		do 
		{
			s = in.next();
			endflag = s.indexOf(".") != -1;
			if(endflag)
			{
				System.out.print(s.length()-1);
			}
			else
			{
				System.out.print(s.length()+ " ");
			}
			
			
		} while(!endflag);
		
	
	}

}
