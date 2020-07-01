import java.util.Scanner;

public class Solution
{

	public static boolean isAnagram(String A, String B)
	{
		//Complete the function
		char[] sortedA;
		char[] sortedB;
		sortedA = A.toUpperCase().toCharArray();
		java.util.Arrays.sort(sortedA);
		sortedB = B.toUpperCase().toCharArray();
		java.util.Arrays.sort(sortedB);
		return java.util.Arrays.equals(sortedA, sortedB);
	}

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}