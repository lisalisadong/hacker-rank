// https://www.hackerrank.com/challenges/closest-numbers

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int min = 20000000;
        String output = "";
        int size = in.nextInt();
        List<Integer> unsorted = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            unsorted.add(in.nextInt());
        }
        List<Integer> sorted = sort(unsorted);
        for (int i = 0; i < size - 1; i++) {
            int current = Math.abs(sorted.get(i) - sorted.get(i + 1));
            if (current < min) {
                min = current;
                output = sorted.get(i) + " " + sorted.get(i + 1);
            } else if (current == min) {
                output = output + " " + sorted.get(i) + " " + sorted.get(i + 1);
            }
        }
        System.out.println(output);
    }
    
    private static List<Integer> sort(List<Integer> unsorted) {
		int size = unsorted.size();
		if (size == 1) {
			return unsorted;
		} else {
			List<Integer> first = unsorted.subList(0, size/2);
			List<Integer> second = unsorted.subList(size/2, size);
			return merge(sort(first), sort(second));
		}
	}
	
	private static List<Integer> merge(List<Integer> first, List<Integer> second) {
		List<Integer> merged = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (merged.size() < first.size() + second.size()) {
			if (i < first.size() && (j >= second.size() || first.get(i) < second.get(j))) {
				merged.add(first.get(i));
				i++;
			} else {
				merged.add(second.get(j));
				j++;
			}
		}
        return merged;
    }
}
