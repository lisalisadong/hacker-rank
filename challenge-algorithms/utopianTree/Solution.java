// https://www.hackerrank.com/challenges/utopian-tree

package utopianTree;

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
    	Map<Integer, Integer> treeGrowth = getHeight();
    	for (int i = 0; i < loop; i++) {
    		int circle = in.nextInt();
    		System.out.println(treeGrowth.get(circle));
    	}
    }
    
    private static Map<Integer, Integer> getHeight() {
    	Map<Integer, Integer> treeGrowth = new HashMap<Integer, Integer>();
    	treeGrowth.put(0, 1);
    	for (int i = 0; i < 60; i++) {
    		if (i % 2 == 0) {
    			treeGrowth.put(i + 1, treeGrowth.get(i) * 2);
    		}
    		else {
    			treeGrowth.put(i + 1, treeGrowth.get(i) + 1);
    		}
    	}
    	return treeGrowth;
    }
}