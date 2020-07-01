import java.util.Scanner;

public class Solution
{

	public static String getSmallestAndLargest(String s, int k)
	{
		String smallest = "";
		String largest = "";
		
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		int maximumSubstringIndex = k - 1;
		smallest = s.substring(0, k);
		largest = s.substring(0, k);
		String currentSubstring;
		for(int i = 1; i < s.length() - maximumSubstringIndex; i++)
		{
			currentSubstring = s.substring(i, i + k);
			if(smallest.compareTo(currentSubstring) > 0)
			{
				smallest = currentSubstring;
			}
			if(largest.compareTo(currentSubstring) < 0)
			{
				largest = currentSubstring;
			}
		}
		
		return smallest + "\n" + largest;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
	  
		System.out.println(getSmallestAndLargest(s, k));
	}
}