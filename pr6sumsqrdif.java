package pr6sumsqrdif;
//Melvin Nguyen's (xeperia1) code
//Finds the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


public class Core 
{
	static Square squareObject = new Square();
	static Sum sumObject = new Sum();
	
	public static void main(String args[])
	{
		System.out.println( sumObject.math() - squareObject.math());
	}
}


public class Square 
{
	public static int math()
	{
		int fin; //squared value *temporary
		int squareSum = 0; //final squares sum
		for(int first = 1; first < 101; first++)
		{
		fin = first * first;
		squareSum += fin;
		}
		return squareSum;
	}
}


public class Sum 
{
	public static int math()
	{
	int sumSquare = 0; //final squares sum
	int total;
	for(int first = 1; first < 101; first++)
	{
	sumSquare += first;
	}
	total = sumSquare * sumSquare;
	return total;
	}
}

