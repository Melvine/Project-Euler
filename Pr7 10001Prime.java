package Pr710001prime;
//Melvin Nguyen's (xeperia1) code
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

//What is the 10 001st prime number?


public class core 
{
	public static void main(String args[])
	{
		int a = 2;
		int fin = 10001;   //change the limit of locating a prime number
		int total = 0;
		while(total < fin )
		{
			//System.out.println("Current #: " + a);
			int i = a;
			int divisor = 0;
				while(i > 0)
				{
				
					if(a%i==0)
					{
				
					 divisor++;
					}
					
		
					i--;
					
				}
					if(divisor == 2) 
					{
						int prime = a;
						total++;
						System.out.println("total: " + total +" prime #: " + prime);
						
					}
			
			    a++;
		}
			
		System.out.println(" ");
		System.out.println(total);
		System.out.println("done");
			
		}
		
	}
