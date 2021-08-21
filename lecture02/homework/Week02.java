package homework;
class Display
{
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit)
	{
		this.limit = limit;
	}
	public void increase()
	{
		value ++ ;
		if(value == limit)
		{
			value = 0;
		}
	}
	public void setValue(int value)
	{
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
	
}

class Clock
{
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	private String time; 
	
	public Clock(int hour, int minute, int second)
	{
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);
	}
	
	public void tick()
	{
		second.increase();
		if(second.getValue()==0)
		{
			minute.increase();
		}
		if(minute.getValue()==0)
		{
			hour.increase();
		}		
	}
	
	//Print the time in format hh:mm:ss 
	public String toString()
	{
		time = String.format("%02d:%02d:%02d", hour.getValue(), 
				minute.getValue(),second.getValue());
		return time;
	}
}

public class Week02 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
}
