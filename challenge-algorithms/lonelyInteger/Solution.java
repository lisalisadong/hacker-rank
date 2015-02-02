// https://www.hackerrank.com/challenges/lonely-integer

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int lonelyinteger(int[] a) {
        HashSet<Integer> cache = new HashSet<Integer>();
        int result = 0;
        for (int n : a) {
            if (!cache.contains(n)) {
                cache.add(n);
                result = result + n;
            } else {
                result = result - n;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
