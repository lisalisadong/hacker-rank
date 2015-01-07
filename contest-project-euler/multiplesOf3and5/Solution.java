// https://www.hackerrank.com/contests/projecteuler/challenges/euler001

package multiplesOf3and5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        for (int i = 0; i < loop; i++) {
            long number = in.nextLong();
            long multiple3 = (number - 1) / 3;
            long multiple5 = (number - 1) / 5;
            long multiple15 = (number - 1) / 15;
            System.out.println((1 + multiple3) * multiple3 * 3 / 2 + (1 + multiple5) * multiple5 * 5 / 2 - (1 + multiple15) * multiple15 * 15 / 2);
        }
    }
}