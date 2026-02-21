package string;

public class ReverseString {

    // reverse string with a single string

    // PrahantYadav -> vadaYtnahsarP

    public static void main(String[] args) {
        System.out.print(reverseString("PrashantYadav"));
    }

    public static String reverseString(String value) {
        char[] a = value.toCharArray();
        char temp;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[(a.length - 1) - i];
            a[(a.length - 1) - i] = temp;
        }
        return new String(a);
    }

}
