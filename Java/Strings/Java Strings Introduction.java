import java.io.*;
import java.util.*;

public class Solution
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		System.out.println((A.length() > 0 ? A.substring(0, 1).toUpperCase() : "") + (A.length() > 1 ? A.substring(1).toLowerCase() : "") + " " + (B.length() > 0 ? B.substring(0, 1).toUpperCase() : "") + (B.length() > 1 ? B.substring(1).toLowerCase() : ""));
	}
}
