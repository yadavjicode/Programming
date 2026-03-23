package string;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abac"));
    }

    public static String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                temp = temp + s.charAt(j);
                if (isPalidrome(temp)) {
                    if (result.length() < temp.length()) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

    // public static boolean isPalidrome(String a) {
    // String b = "";
    // for (int i = a.length() - 1; i > -1; i--) {
    // b = b + a.charAt(i);
    // }
    // return (a.equals(b));

    // }

    public static boolean isPalidrome(String b) {
        char[] a = b.toCharArray();
        char temp;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[(a.length - 1) - i];
            a[(a.length - 1) - i] = temp;
        }
        String result;
        result = new String(a);
        return (b.equals(result));
    }

}
