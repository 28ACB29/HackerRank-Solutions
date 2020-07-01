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
		HashMap<String, String> phoneBook;
		String name;
		String phoneNumber;
		scanner = new Scanner(System.in);
		n = Integer.parseInt(scanner.nextLine());
		phoneBook = new HashMap<String, String>(n);
		for(int i = 0; i < n; i++)
		{
			name = scanner.nextLine();
			phoneNumber = scanner.nextLine();
			phoneBook.put(name, phoneNumber);
		}
		while(scanner.hasNext())
		{
			name = scanner.nextLine();
			if(phoneBook.containsKey(name)) {
				System.out.println(name + "=" + phoneBook.get(name));
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
}
