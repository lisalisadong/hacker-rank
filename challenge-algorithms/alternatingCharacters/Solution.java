// https://www.hackerrank.com/challenges/alternating-characters

package alternatingCharacters;

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
            String characters = in.next();
            String last = null;
            int count = 0;
            for (int j = 0; j < characters.length(); j++) {
                if (characters.substring(j, j + 1).equals(last)) {
                    count++;
                }
                else {
                    last = characters.substring(j, j + 1);
                }
            }
            System.out.println(count);
        }
    }
}