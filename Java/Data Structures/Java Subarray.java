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
		int n;
		int[] array;
		int[] suffixSums;
		int negativeSubArrays;
		scanner = new Scanner(System.in);
		n = Integer.parseInt(scanner.nextLine());
		array = new int[n];
		suffixSums = new int[n];
		negativeSubArrays = 0;
		for(int i = 0; i < n; i++)
		{
			array[i] = scanner.nextInt();
		}
		suffixSums[n - 1] = array[n - 1];
		for(int i = n - 2; i > -1; i--)
		{
			suffixSums[i] = array[i] + suffixSums[i + 1];
		}
		if(suffixSums[n - 1] < 0)
		{
			negativeSubArrays++;
		}
		for(int i = 0; i < n - 1; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(suffixSums[i] - suffixSums[j] < 0)
				{
					negativeSubArrays++;
				}
			}
			if(suffixSums[i] < 0)
			{
				negativeSubArrays++;
			}
		}
		System.out.println(negativeSubArrays);
	}
}
