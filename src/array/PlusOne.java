package array;

import java.util.Arrays;

/*
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].


Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].


Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

*/

public class PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] { 1, 2, 3 })));

    }

    public static int[] plusOne(int[] digits) {

        int b = 1;

        for (int i = (digits.length - 1); i >= 0; i--) {
            int temp = digits[i] + b;

            if (temp > 9) {
                digits[i] = temp % 10;
                b = temp / 10;
            } else {
                digits[i] = temp;
                b = 0;
            }
        }

        System.out.println(b);
        if (b > 0) {
            int[] result = new int[digits.length + 1];
            for (int i = 0; i < result.length; i++) {
                if (i == 0) {
                    result[i] = b;

                } else {
                    result[i] = digits[i - 1];
                }
            }
            return result;
        } else {
            return digits;
        }

    }

}
