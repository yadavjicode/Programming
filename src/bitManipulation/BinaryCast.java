package bitManipulation;

public class BinaryCast {

    // decimal to binary 10==>1010 , 1==>1, 2==>10

    public static void main(String[] args) {
        System.out.println(binaryToDecimal("1010"));
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
            result = (result << 1) + (a.charAt(i)-'0');

        }

        return result;

    }

}
