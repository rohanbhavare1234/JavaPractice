import java.io.*;
import java.util.Scanner;

class Demo3
{
	public static void main(String args[])
	{

		int day=0;
                                System.out.println("Enter the no between  1-7");
		Scanner d1 = new Scanner(System.in);
		try {
			day=d1.nextInt()/0;
		}	    
		catch (Exception e)
		{
                                  System.out.println("Who is bustard traying to stop  me to execute further"+e.getMessage());
		}
		switch(day)
		{
			case 1:
			System.out.println("Monday");
			break;
			
			case 2:
			System.out.println("Tuesday");
			break;
			
			default :
			System.out.println("Wrong choice");  
		}	
	}
}