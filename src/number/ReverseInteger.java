package number;

public class ReverseInteger {

    // Minimum: −2,147,483,648

    // Maximum: 2,147,483,647

    public static void main(String[] args) {

        System.out.println(reverse(-2147483648));

    }

    public static int reverse(int x) {
        long result = 0;
        if (x > 0) {

            while (x > 0) {
                result = (result) * 10 + x % 10;
                x = x / 10;
            }

        } else {

            while (x < 0) {
                result = (result) * 10 + x % 10;
                x = x / 10;

            }

        }

        if (result > 2147483647 || result < -2147483647) {
            return 0;
        } else {
            return (int) result;
        }

    }

}
