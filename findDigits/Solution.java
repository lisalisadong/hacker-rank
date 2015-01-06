package findDigits;
// https://www.hackerrank.com/challenges/find-digits

import java.util.*;
import java.text.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	/*
    	try {
			System.setIn(new FileInputStream("./findDigits/Input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        for (int i = 0; i < loop; i ++) {
            int number = in.nextInt();
            int copy = number;
            int count = 0;
            while (copy > 0) {
                int digit = copy % 10;
                if (digit != 0 && number % digit == 0) {
                    count ++;
                }
                copy = copy / 10;
            }
            System.out.println(count);
        }
    }
}
