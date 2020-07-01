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
		ArrayList<ArrayList<Integer>> lists;
		String[] splitLine;
		int d;
		ArrayList<Integer> list;
		int q;
		int x;
		int y;
		scanner = new Scanner(System.in);
		n = Integer.parseInt(scanner.nextLine());
		lists = new ArrayList<ArrayList<Integer>>(n);
		for(int i = 0; i < n; i++)
		{
			splitLine = scanner.nextLine().split(" ");
			d = Integer.parseInt(splitLine[0]);
			list = new ArrayList<Integer>(d);
			for(int j = 0; j < d; j++)
			{
				list.add(j, Integer.parseInt(splitLine[j + 1]));
			}
			lists.add(i, list);
		}
		q = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < q; i++)
		{
			splitLine = scanner.nextLine().split(" ");
			x = Integer.parseInt(splitLine[0]);
			y = Integer.parseInt(splitLine[1]);
			if(y <= lists.get(x - 1).size())
			{
				System.out.println(lists.get(x - 1).get(y - 1));
			}
			else
			{
				System.out.println("ERROR!");
			}
		}
	}
}
