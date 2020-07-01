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
		int T;
		String[] splitLine;
		int n;
		int m;
		int[] board;
		Stack<Integer> moves;
		boolean canWin;
		boolean canMove;
		int top;
		scanner = new Scanner(System.in);
		T = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < T; i++)
		{
			splitLine = scanner.nextLine().split(" ");
			n = Integer.parseInt(splitLine[0]);
			m = Integer.parseInt(splitLine[1]);
			splitLine = scanner.nextLine().split(" ");
			board = new int[splitLine.length];
			for(int j = 0; j < splitLine.length; j++)
			{
				board[j] = Integer.parseInt(splitLine[j]);
			}
			moves = new Stack<Integer>();
			moves.push(0);
			canWin = false;
			canMove = true;
			while(canMove)
			{
				if(!moves.empty())
				{
					top = moves.peek();
					if(top + m > n - 1 || top + 1 > n - 1 || top - 1 > n - 1)
					{
						canWin = true;
						canMove = false;
					}
					else if(top + m < n && board[top + m] == 0)
					{
						moves.push(top + m);
					}
					else if(top + 1 < n && board[top + 1] == 0)
					{
						moves.push(top + 1);
					}
					else if(top - 1 > -1 && board[top - 1] == 0)
					{
						moves.push(top - 1);
					}
					else
					{
						moves.pop();
					}
					board[top] = 1;
				}
				else
				{
					canWin = false;
					canMove = false;
				}
			}
			System.out.println(canWin ? "YES" : "NO");
		}
	}
}
