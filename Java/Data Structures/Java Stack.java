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
		String input;
		Stack<Character> characterStack;
		char character;
		boolean isStringBalanced;
		boolean isParseable;
		scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			input = scanner.nextLine();
			characterStack = new Stack<Character>();
			isParseable = true;
			for(int i = 0; isParseable && i < input.length(); i++)
			{
				character = input.charAt(i);
				switch(character)
				{
					case '(':
					case '[':
					case '{':
						characterStack.push(character);
						break;
					case ')':
						if(!characterStack.empty() && characterStack.peek() == '(')
						{
							characterStack.pop();
						}
						else
						{
							isParseable = false;
						}
						break;
					case ']':
						if(!characterStack.empty() && characterStack.peek() == '[')
						{
							characterStack.pop();
						}
						else
						{
							isParseable = false;
						}
						break;
					case '}':
						if(!characterStack.empty() && characterStack.peek() == '{')
						{
							characterStack.pop();
						}
						else
						{
							isParseable = false;
						}
						break;
					default:
						isParseable = false;
						break;
				}
			}
			isStringBalanced = isParseable && characterStack.empty();
			System.out.println(isStringBalanced ? "true" : "false");
		}
	}
}
