package Day2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class RTO
{
	int age;
	public void acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt(); 
		
	}
	public void verify() throws Exception
	{
		if(age<18)
		{
			UnderAgeException exception = new UnderAgeException();
			throw exception;
		}
		else  if(age>46)
		{
			
			OverAgeException overAgeException = new OverAgeException();
			throw overAgeException;
			
		}
		else
		{
			System.out.println("Your eligible for driving licence");
		}
		
		
	}
	
}

class UnderAgeException extends Exception
{
	public String notEligi()
	{
		return "Try after you get 18+ years";
	}
}

class OverAgeException extends Exception
{
	public String notEligible()
	{
		return "Your became too older";
	}
}

public class CustomirizedExceptions {

	public static void main(String[] args) {
		RTO rto = new RTO();
		rto.acceptInput();
		try
		{
			rto.verify();
		}
		catch (Exception e) {
			try
			{
				rto.acceptInput();
				rto.verify();
			}
			catch (Exception e1) {
				System.out.println("You reached maximun attempts");
			}
		}
		
		

	}

}
