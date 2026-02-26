package array;

import java.util.Arrays;

public class SortOneBits {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortByBits(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8
        })));

    }

    public static int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(oneBits(arr[i]));
            for (int j = i; j < arr.length; j++) {
                if (oneBits(arr[i]) == oneBits(arr[j])) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                    if (oneBits(arr[i]) > oneBits(arr[j])) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
        }

        return arr;
    }

    public static int oneBits(int a) {
        int temp = 0;
        while (a > 1) {
            if (a % 2 == 1) {
                temp = temp + 1;
            }
            a = a / 2;
        }
        return temp + a;

    }

}
