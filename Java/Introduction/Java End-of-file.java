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
        String input;
        scanner = new Scanner(System.in);
        for(int line = 1; scanner.hasNext(); line++)
        {
            input = scanner.nextLine();
            System.out.println(line + " " + input);
        }
    }
}
