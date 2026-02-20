package string;

public class UniqueChar {

    public static void main(String[] args) {
        System.out.println(uniqueChar("aaabcdcdaaaaZ"));
    }

    public static String uniqueChar(String value) {
        char[] a = (value.toLowerCase()).toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count != 0) {
                a[i] = ' ';
            } else {
                result.append(a[i]);

            }

        }

        return result.toString();

    }

}
