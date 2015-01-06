// https://www.hackerrank.com/challenges/flipping-bits

package flippingBits;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your codes here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        long bound = 4294967295L;
        for (int i = 0; i < loop; i++){
        	long next = in.nextLong();
            System.out.println(bound - next);
        }
    }
}