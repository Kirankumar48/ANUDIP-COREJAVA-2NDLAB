package controlstatements;

public class LeapYear {
	public static void main(String args[])
	{
		int year = 2000;
		int a = year%4;
		if(a==0)
		{
			System.out.println("its a leap Year");
			
		}
		else
		{
			System.out.println("its not a leap Year");
			
		}
	}

}
