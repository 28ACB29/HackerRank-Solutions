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
        String[] strings;
        int[] integers;
        scanner = new Scanner(System.in);
        strings = new String[3];
        integers = new int[3];
        for(int i = 0; i <3; i++)
        {
            strings[i] = scanner.next();
            integers[i] = Integer.parseInt(scanner.next());
        }
        System.out.println("================================");
        for(int i = 0; i <3; i++)
        {
            System.out.printf("%-14s %03d %n", strings[i], integers[i]);
        }
        System.out.println("================================");
    }
}
