
class AddBinaryNumbers {
    // 1111
    // Add 11001
    // + 10111
    // ---------
    // . 1100000

    public static void main(String[] args) {

        String a = "11111";
        String b = "1111100000";
        String c = "";
        char carry = '0';

        System.err.println("a length =" + a.length());
        System.err.println("b length =" + b.length());
        if (a.length() > b.length()) {
            int difference = (a.length() - b.length());
            for (int i = 0; i < difference; i++) {
                b = '0' + b;
            }
            System.err.println("a =" + difference);
        } else {
            int difference = (b.length() - a.length());
            for (int i = 0; i < difference; i++) {
                a = '0' + a;
            }
            System.err.println("b =" + difference);
        }

        System.err.println("a=" + a);
        System.err.println("b=" + b);
        for (int i = 0; i < a.length(); i++) {

            char tempa = a.charAt((a.length() - 1) - i);

            char tempb = b.charAt((a.length() - 1) - i);

            c = c + outputBinary(outputBinary(tempa, tempb), carry);
            System.err.println("C=" + c);
            carry = carryBinaryU(carryBinary(tempa, tempb), carry);
            System.err.println("carry=" + carry);
        }

        String result = c + carry;

        System.out.println("Result=" + reverseString(result));
        System.out.println("reverse String=" + reverseString("Yadav"));

    }

    public static char outputBinary(char a, char b) {
        if ((a == '1' && b == '1')) {
            return '0';
        } else if ((a == '1' && b == '0') || (a == '0' && b == '1')) {
            return '1';

        } else {
            return '0';

        }
    }

    public static char carryBinary(char a, char b) {

        if ((a == '1' && b == '1')) {

            return '1';
        } else {
            return '0';

        }

    }

    public static char carryBinaryU(char a, char b) {
        if ((a == '1' || b == '1')) {

            return '1';
        } else {
            return '0';

        }
    }

    public static String reverseString(String value) {
        // prash
        // pras
        String temp = "";
        for (int i = 0; i < (value.length()); i++) {

            temp = temp + value.charAt((value.length() - 1) - i);

        }
        return temp;
    }
}
