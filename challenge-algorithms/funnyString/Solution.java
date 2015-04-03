// https://www.hackerrank.com/challenges/funny-string

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int numberOfTests = in.nextInt();
    	for (int i = 0; i < numberOfTests; i++) {
    		char[] chars = in.next().toCharArray();
    		int l = chars.length;
    		boolean funny = true;
    		int j = 0;
    		while (funny) {
    			if (j >= (l - 1) / 2) {
    				break;
    			}
    			if (Math.abs(chars[j] - chars[j + 1]) == Math.abs(chars[l - j - 1] - chars[l - j - 2])) {
    				j++;
    			} else {
    				funny = false;
    			}
    		}
    		if (funny) {
    			System.out.println("Funny");
    		} else {
    			System.out.println("Not Funny");
    		}
    	}
    	in.close();
    }
}