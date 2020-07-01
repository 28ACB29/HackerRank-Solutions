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
        int integer;
        double doubleFloat;
        String string;
        scanner = new Scanner(System.in);
        integer = Integer.parseInt(scanner.nextLine());
        doubleFloat = Double.parseDouble(scanner.nextLine());
        string = scanner.nextLine();
        System.out.println("String: " + string);
        System.out.println("Double: " + doubleFloat);
        System.out.println("Int: " + integer);
    }
}
