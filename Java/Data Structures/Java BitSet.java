import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

	public static void main(String[] args)
	{

		/* Enter your code here.
		Read input from STDIN.
		Print output to STDOUT.
		Your class should be named Solution. */
		Scanner scanner;
		String[] input;
		int N;
		int M;
		BitSet bitSet1;
		BitSet bitSet2;
		int arg1;
		int arg2;
		scanner = new Scanner(System.in);
		input = scanner.nextLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		bitSet1 = new BitSet(N);
		bitSet2 = new BitSet(N);
		for(int i = 0; i < M; i++)
		{
			input = scanner.nextLine().split(" ");
			arg1 = Integer.parseInt(input[1]);
			arg2 = Integer.parseInt(input[2]);
			switch(input[0])
			{
				case "AND":
					switch(arg1)
					{
						case 1:
							bitSet1.and(bitSet2);
							break;
						case 2:
							bitSet2.and(bitSet1);
							break;
						default:
							break;
					}
					break;
				case "FLIP":
					switch(arg1)
					{
						case 1:
							bitSet1.flip(arg2);
							break;
						case 2:
							bitSet2.flip(arg2);
							break;
						default:
							break;
					}
					break;
				case "OR":
					switch(arg1)
					{
						case 1:
							bitSet1.or(bitSet2);
							break;
						case 2:
							bitSet2.or(bitSet1);
							break;
						default:
							break;
					}
					break;
				case "SET":
					switch(arg1)
					{
						case 1:
							bitSet1.set(arg2);
							break;
						case 2:
							bitSet2.set(arg2);
							break;
						default:
							break;
					}
					break;
				case "XOR":
					switch(arg1)
					{
						case 1:
							bitSet1.xor(bitSet2);
							break;
						case 2:
							bitSet2.xor(bitSet1);
							break;
						default:
							break;
					}
					break;
				default:
					break;
			}
			System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
		}
	}
}
