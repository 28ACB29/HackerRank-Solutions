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
        String input;
        long number;
        scanner = new Scanner(System.in);
        T = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < T; i++)
        {
            input = scanner.nextLine();
            try
            {
                number = Long.parseLong(input);
                System.out.println(input + " can be fitted in:");
                if(number >= (long) Byte.MIN_VALUE && number <= (long) Byte.MAX_VALUE)
                {
                    System.out.println("* byte");
                }
                if(number >= (long) Short.MIN_VALUE && number <= (long) Short.MAX_VALUE)                 {
                    System.out.println("* short");
                }
                if(number >= (long) Integer.MIN_VALUE && number <= (long) Integer.MAX_VALUE)
                {
                    System.out.println("* int");
                }
                if(number >= Long.MIN_VALUE && number <= Long.MAX_VALUE)
                {
                    System.out.println("* long");
                }
            }
            catch(NumberFormatException numberFormatException)
            {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
    }
}
