package bitManipulation;

public class ConcatenatedBinary {

    public static void main(String[] args) {
        System.out.println(concatenatedBinary(72387));
    }

    public static int concatenatedBinary(int n) {
        // String name = "";
        StringBuilder name = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            name.append(decimalToBinay(i));
            // name = name + decimalToBinay(i);
        }
        return (binaryToDecimal(name.toString()));
        // return name.toString();
    }

    public static String decimalToBinay(int a) {
        StringBuilder result = new StringBuilder();
        while (a > 0) {
            result.append(a & 1);
            a = a >> 1;
        }
        return result.reverse().toString();
    }

    public static int binaryToDecimal(String a) {
        int result = 0;
        for (int i = 0; i < a.length(); i++) {
            result = ((result << 1) + (a.charAt(i) - '0')) % 1000000007;
        }
        return result;
    }

    // public static String DecimalToBinary(int a) {
    // String result = "";
    // String resultB = "";

    // while (a > 1) {

    // if ((a % 2) == 1) {
    // result = result + "1";
    // } else {
    // result = result + "0";
    // }
    // a = a / 2;
    // }
    // for (int i = (result.length() - 1); i > -1; i--) {
    // resultB = resultB + result.charAt(i);
    // }

    // return a + resultB;

    // }

    // public static int binaryToDecimal(String value) {
    // int result = 0;
    // for (int i = (value.length() - 1); i > -1; i--) {

    // if (value.charAt(i) == '1') {

    // result = (result + ((1) * square(2, ((value.length() - (i + 1)))))) %
    // 1000000007;

    // } else {

    // result = (result + ((0) * square(2, ((value.length() - (i + 1)))))) %
    // 1000000007;

    // }
    // }

    // return result;

    // }

    // public static int square(int value, int power) {

    // int result = 1;
    // for (int i = 0; i < power; i++) {
    // result = (result * value) % 1000000007;
    // }
    // return result;

    // }

}
