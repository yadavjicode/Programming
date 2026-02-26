package array;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseString(new char[] { 'a', 'v', 'b', 'f', 'g', 'g' })));
    }

    public static char[] reverseString(char[] s) {
        Character temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[(s.length - 1) - i];
            s[(s.length - 1) - i] = temp;

        }
        return s;
    }

}
