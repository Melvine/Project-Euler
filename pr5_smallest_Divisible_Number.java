package Pr5smallnumber;
//Melvin Nguyen's (xeperia1) code
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

//the comments in the code are *debuggers* - releasing the "//" will walk you through the code number by number
public class core {

	public static int divisible = 0;
	public static void main(String args[])
	{
		
		int start;
		
		for (start=1; divisible < 20; start++)
		{
		
		for (int i = 1; i < 21; i++)
		{
			int stepOne = start%i;
				//System.out.println("   remainder: " + stepOne);
			if (stepOne == 0)
			{
				divisible++;
			}
			else
			{
				//System.out.println("else");
				divisible = 0;
			}
			//System.out.println( start + " : divided by " + i + " returned a reminder of: " + divisible);
		}
		}
		System.out.println( start - 1);
		
	}
}
