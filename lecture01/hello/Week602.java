package hello;

import java.util.Scanner;

public class Week602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GPS data processing
		//See details at https://www.icourse163.org/learn/ZJU-1001541001?tid=1463251445#/learn/ojhw?id=1237096111
		Scanner in = new Scanner(System.in);
		String BJT = "";
		String s = in.nextLine();
		while(!s.equals("END"))
		{
			if(s.startsWith("$GPRMC"))
			{
				//index of first and second commas
				int f_comma = s.indexOf(",");
				int s_comma = s.indexOf(",", f_comma+1);
				//index of begin and end				
				int k = s.indexOf("$");
				int l = s.indexOf("*");
				//get substring of the UTC time, status and check number
				String UTC = s.substring(f_comma+1, s_comma);
				String check_s = s.substring(l+1, l+3);
				int check_i = Integer.parseInt(check_s,16);
				char status = s.charAt(s_comma+1);
				
				//initialize, calculate and check the XOR value;
				int xor_value = 0;
				for(int m=k+1; m<l; m++)
				{
					xor_value ^= s.charAt(m);
				}
				if(xor_value != check_i || status != 'A')
				{
					s = in.nextLine();
					continue;
				}
				//UTC TO BJT
				int hour = Integer.parseInt(UTC.substring(0, 2));
				if(hour>=16)
				{
					hour -= 16;
				}
				else
				{
					hour += 8;
				}
				if(hour<10)
				{
					BJT = "0"+hour + ":"+ UTC.substring(2, 4) +
							":" + UTC.substring(4,6);
				}
				else
				{
					BJT = hour + ":"+ UTC.substring(2, 4) +
							":" + UTC.substring(4,6);
				}
				
			}
			
			s = in.nextLine();
		}
		//Print out the time of the last record
		System.out.print(BJT);
	}

}
