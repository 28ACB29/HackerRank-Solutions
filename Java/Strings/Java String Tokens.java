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
		Pattern pattern;
		Matcher matcher;
		ArrayList<String> matches;
		scanner = new Scanner(System.in);
		pattern = Pattern.compile("[A-Za-z]+");
		matcher = pattern.matcher(scanner.nextLine());
		matches = new ArrayList<String>();
		while (matcher.find())
		{
			matches.add(matcher.group());
		}
		System.out.println(matches.size());
		for(String match : matches)
		{
			System.out.println(match);
		}
	}
}
