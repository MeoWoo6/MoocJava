package Homework;
import java.util.Scanner;

class Fraction
{
	int nume;
	int denume;
	//greatest common divisor
	int GCD(int a, int b)
	{
		int gcd;
		gcd = a % b;
		while(gcd!=0)
		{
			a = b;
			b = gcd;
			gcd = a % b;
		}
		return b;
	}
	
	Fraction(int a, int b)
	{
		nume = a;
		denume = b;
	}
	void print()
	{
		int gcd = GCD(nume, denume);
		nume /= gcd;
		denume /= gcd;
		if(nume == denume)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(nume+"/"+denume);
		}
		
	}
	Fraction plus(Fraction r)
	{
		int new_nume;
		int new_denume;
		new_nume = nume * r.denume + r.nume * denume;
		new_denume = denume * r.denume;
		Fraction new_frac = new Fraction(new_nume, new_denume);
		return new_frac;
	}
	
	Fraction multiply(Fraction r)
	{
		int new_nume;
		int new_denume;
		new_nume = nume * r.nume;
		new_denume = denume * r.denume;
		Fraction new_frac = new Fraction(new_nume, new_denume);
		return new_frac;
	}
	
}

public class Week01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

