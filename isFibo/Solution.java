// https://www.hackerrank.com/challenges/is-fibo

package isFibo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashSet<Long> fibo = Fibo(10000000000L);
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        for (int i = 0; i < loop; i ++) {
        	long test = in.nextLong();
        	if (fibo.contains(test)) {
        		System.out.println("IsFibo");
        	}
        	else { 
        		System.out.println("IsNotFibo"); 
        	}
        }        	
    }
    
    private static HashSet<Long> Fibo(long bound) {
    	HashSet<Long> fibo = new HashSet<Long>();
    	fibo.add(0L);
    	fibo.add(1L);
    	long lastlast = 0L;
    	long last = 1L;
    	while (last < bound) {
    		long current = lastlast + last;
    		fibo.add(current);
    		lastlast = last; 
    		last = current;
    	}
    	return fibo;
    }
}