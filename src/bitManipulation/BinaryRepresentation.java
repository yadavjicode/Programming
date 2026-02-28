package bitManipulation;

import java.math.BigInteger;

/*
1404. Number of Steps to Reduce a Number in Binary Representation to One
Medium
Topics
premium lock icon
Companies
Hint
Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:

If the current number is even, you have to divide it by 2.

If the current number is odd, you have to add 1 to it.

It is guaranteed that you can always reach one for all test cases.

 
Example 1:

Input: s = "1101"
Output: 6
Explanation: "1101" corressponds to number 13 in their decimal representation.
Step 1) 13 is odd, add 1 and obtain 14. 
Step 2) 14 is even, divide by 2 and obtain 7.
Step 3) 7 is odd, add 1 and obtain 8.
Step 4) 8 is even, divide by 2 and obtain 4.  
Step 5) 4 is even, divide by 2 and obtain 2. 
Step 6) 2 is even, divide by 2 and obtain 1.  


Example 2:

Input: s = "10"
Output: 1
Explanation: "10" corresponds to number 2 in their decimal representation.
Step 1) 2 is even, divide by 2 and obtain 1.  
Example 3:

Input: s = "1"
Output: 0
*/

public class BinaryRepresentation {

    public static void main(String[] args) {

        System.out.println(numSteps("1101"));
    }

    public static int numSteps(String s) {
        BigInteger num = new BigInteger("10", 2);

        // long a = binaryToDecimal(s);
        // int step = 0;
        // while (a > 1) {
        // if (a % 2 == 0) {
        // a = a / 2;

        // } else {
        // a = a + 1;

        // }

        // step = step + 1;

        // }

        int step = 0;
        while (num.compareTo(BigInteger.ONE) == 1) {
            if (num.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                num = num.divide(BigInteger.TWO);

            } else {
                num = num.add(BigInteger.ONE);
            }
            step = step + 1;
        }
        return step;
    }

    public static long binaryToDecimal(String value) {
        long result = 0;
        for (int i = (value.length() - 1); i > -1; i--) {

            if (value.charAt(i) == '1') {

                result = result + ((1) * square(2, ((value.length() - (i + 1)))));
            } else {

                result = result + ((0) * square(2, ((value.length() - (i + 1)))));

            }
        }

        return result;

    }

    public static long square(long value, long power) {

        long result = 1;
        for (int i = 0; i < power; i++) {
            result = result * value;
        }
        return result;

    }

    // big integer use approach
    // ==========================================================>

    // ====================================================================================>

}
