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
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> L = new ArrayList<Integer>(N);
		for(int i = 0; i < N; i++)
		{
			L.add(sc.nextInt());
		}
		int Q = sc.nextInt();
		String query;
		int x;
		int y;
		for(int i = 0; i < Q; i++)
		{
			query = sc.next();
			switch(query)
			{
				case "Insert":
					x = sc.nextInt();
					y = sc.nextInt();
					L.add(x, y);
					break;
				case "Delete":
					x = sc.nextInt();
					L.remove(x);
					break;
			}
		}
		System.out.print(L.get(0).toString());
		for(int i = 1; i < L.size(); i++)
		{
			System.out.print(" " + L.get(i).toString());
		}
	}
}
