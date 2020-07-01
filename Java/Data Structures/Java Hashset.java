import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String [] pair_left = new String[t];
		String [] pair_right = new String[t];
		
		for (int i = 0; i < t; i++)
		{
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		HashSet<String> lineSet;
		lineSet = new HashSet<String>();
		for(int i = 0; i < t; i++)
		{
			lineSet.add(pair_left[i] + "," + pair_right[i]);
			System.out.println(lineSet.size());
		}
	}
}