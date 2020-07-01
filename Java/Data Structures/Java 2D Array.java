import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args)
	{

		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner;
		int[][] board;
		int maximumSum;
		int hourglassSum;
		scanner = new Scanner(System.in);
		board = new int[6][6];
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				board[i][j] = scanner.nextInt();
			}
		}
		maximumSum = Integer.MIN_VALUE;
		for(int i = 1; i < 5; i++)
		{
			for(int j = 1; j < 5; j++)
			{
				hourglassSum = board[i - 1][j - 1] + board[i - 1][j] + board[i - 1][j + 1] + board[i][j] + board[i + 1][j - 1] + board[i + 1][j] + board[i + 1][j + 1];
				if(maximumSum < hourglassSum)
				{
					maximumSum = hourglassSum;
				}
			}
		}
		System.out.println(maximumSum);
	}
}
