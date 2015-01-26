// https://www.hackerrank.com/challenges/the-love-letter-mystery

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
            String word = in.next();
            int l = word.length();
            int count = 0;
            for (int j = 0; j < l / 2; j++) {
                count = count + Math.abs(word.substring(j, j + 1).compareTo(word.substring(l - j - 1, l - j)));
            }
            System.out.println(count);
        }
    }
}
