package homework;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		String a = "xxx";
		String b = "yyy";
		str.add(a);
		str.add(b);
		System.out.print(str.get(0)+" ");
		System.out.print(str.get(1)+" ");
		a = "zzz";
		System.out.print(str.get(0));

	}

}
