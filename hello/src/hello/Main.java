package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int bjt;
		int utc;
		bjt = in.nextInt();
		if(bjt>=800)
		{ utc = bjt - 800; }
		else 
		{ utc = bjt + 1600; }
		System.out.println(utc);
	}

}
