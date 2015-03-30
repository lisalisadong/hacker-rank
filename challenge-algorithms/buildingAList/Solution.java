// https://www.hackerrank.com/challenges/building-a-list
// Complexity: O(2^n)

import java.awt.datatransfer.StringSelection;
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
    		int lengthOfString = in.nextInt();
    		String string = in.next();
    		// char[] characters = string.toCharArray();
    		// Arrays.sort(characters);
    		// string = new String(characters);
    		ArrayList<String> combi = new ArrayList<String>();
    		findCombi(string, 0, "", combi);
    		for (String s : combi) {
    			System.out.println(s);
    		}
    	}
    }
    
    public static void findCombi(String string, int pointer, String current, ArrayList<String> combi) {
    	if (current.equals("")) {
    		if (pointer >= string.length()) { return; }
    		findCombi(string, pointer + 1, string.substring(pointer, pointer + 1), combi);
    		findCombi(string, pointer + 1, "", combi);
    		return;
    	} else {
    		if (string.substring(pointer - 1, pointer).equals(current.substring(current.length() - 1, current.length()))) {
    			combi.add(current);
    		}
    		if (pointer >= string.length()) { return; }
    		findCombi(string, pointer + 1, current + string.substring(pointer, pointer + 1), combi);
    		findCombi(string, pointer + 1, current, combi);
    	}
    }
}