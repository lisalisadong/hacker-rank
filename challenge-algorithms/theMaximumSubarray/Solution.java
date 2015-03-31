// https://www.hackerrank.com/challenges/maxsubarray
// Time complexity: O(n)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int numberOfTests = in.nextInt();
    	for (int test = 0; test < numberOfTests; test++) {
    		int lengthOfArray = in.nextInt();
    		int[] array = new int[lengthOfArray];
    		for (int i = 0; i < lengthOfArray; i ++) {
    			array[i] = in.nextInt();
    		}
    		System.out.println(findContiguous(array) + " " + findNonContiguous(array));
    	}
    }
    
    public static int findContiguous(int[] array) {
    	int currentBiggestSum = 0;
    	int biggestInt = -10000;
    	int sum = 0;
    	for (int number : array) {
    		if (number > biggestInt) {
    			biggestInt = number;
    		}
    		if (number > 0) {
    			sum = sum + number;
    			if (sum > currentBiggestSum) {
    				currentBiggestSum = sum;
    			}
    		} else {
    			if (sum > currentBiggestSum) {
    				currentBiggestSum = sum;
    			} else if (sum + number > 0) {
    				sum = sum + number;
    			} else {
    				sum = 0;
    			}
    		}
    	}
    	if (currentBiggestSum == 0) {
    		return biggestInt;
    	} else {
    		return currentBiggestSum;
    	}
    }
    
    public static int findNonContiguous(int[] array) {
    	int sum = 0;
    	int biggestInt = -10000;
    	for (int number : array) {
    		if (number > biggestInt) {
    			biggestInt = number;
    		}
    		if (number > 0) {
    			sum = sum + number;
    		}
    	}
    	if (sum == 0) {
    		return biggestInt;
    	} else {
    		return sum;
    	}
    }
}