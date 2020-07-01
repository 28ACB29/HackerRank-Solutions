import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases > 0)
		{
			String pattern = in.nextLine();
				//Write your code
			Pattern candidatePattern;
			try
			{
				candidatePattern = Pattern.compile(pattern);
				System.out.println("Valid");
			}
			catch(PatternSyntaxException patternSyntaxException)
			{
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}
