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
        int t;
        int a;
        int b;
        int n;
        StringBuilder stringBuilder;
        scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for(int i = 0; i < t; i++)
        {
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();
            stringBuilder = new StringBuilder();
            for(int j = 0; j < n - 1; j++)
            {
                stringBuilder.append((a + b * ((1 << (j + 1)) - 1)) + " ");
            }
            stringBuilder.append(a + b * ((1 << (n)) - 1));
            System.out.println(stringBuilder.toString());
        }
    }
}
