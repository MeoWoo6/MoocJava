package hello;

import java.util.Scanner;

public class Week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int RS;
		int R;
		int S;
		RS = in.nextInt();
		R = RS/10;
		S = RS%10;
		switch(S)
		{
		case 1: 
			System.out.print("Faint signals, barely perceptible");
			break;
		case 2: 
			System.out.print("Very weak signals");
			break;
		case 3: 
			System.out.print("Weak signals");
			break;
		}
		switch(R)
		{
		case 1: 
			System.out.print(", unreadable");
			break;
		case 2: 
			System.out.print(", barely readable, occasional words distinguishable");
			break;
		case 3: 
			System.out.print(", readable with considerable difficulty");
			break;
		}
		System.out.println();
	}

}
