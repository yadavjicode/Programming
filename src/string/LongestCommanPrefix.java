package string;

public class LongestCommanPrefix {
    // strs = ["flower","flow","flight"]
    // output= fl

    
    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[] { "aaa", "aa", "aaa" }));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else {
            int minSize = strs[0].length();
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < minSize) {
                    minSize = strs[i].length();
                }
            }
            System.out.println("min Size" + minSize);
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < minSize; i++) {
                int temp = 0;
                char prev;
                char currentChar = strs[0].charAt(i);

                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].charAt(i) == currentChar) {
                        temp++;
                    }
                }

                if (temp == strs.length) {
                    result.append(currentChar);
                } else {
                    return result.toString();
                }

            }
            return result.toString();
        }

    }

}
