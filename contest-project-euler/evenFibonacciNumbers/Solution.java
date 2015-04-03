// https://www.hackerrank.com/contests/projecteuler/challenges/euler002

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int numberOfTests = in.nextInt();
    	for (int i = 0; i < numberOfTests; i++) {
    		long n = in.nextLong();
    		long sum = 0;
    		for (long j = 1 ; j <= (n + 1) / 3; j++) {
    			if (fibonacci(j * 3 - 1) <= n) {
    				sum = sum + fibonacci(j * 3 - 1);
    			} else {
    				break;
    			}
    		}
    		System.out.println(sum);
    	}
    	in.close();
    }
    
    public static long fibonacci(long n) {
    	n = n + 1;
    	double Phi = (1 + Math.sqrt(5)) / 2;
    	double phi = (1 - Math.sqrt(5)) / 2;    	
    	long fibo = (long) ((Math.pow(Phi, n) - Math.pow(phi, n)) / Math.sqrt(5));
    	return fibo;
    }
}