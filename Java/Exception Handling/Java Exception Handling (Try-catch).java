import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

	public static void main(String[] args)
	{

		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner;
		int x;
		int y;
		scanner = new Scanner(System.in);
		try
		{
			x = scanner.nextInt();
			y = scanner.nextInt();
			System.out.println(x / y);
		}
		catch(InputMismatchException inputMismatchException)
		{
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
	}
}
