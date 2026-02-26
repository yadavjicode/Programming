package array;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }

    // public static int majorityElement(int[] nums) {
    // int result = 0;
    // int value = 0;

    // for (int i = 0; i < nums.length; i++) {
    // int sum = 0;
    // boolean check = true;
    // for (int j = i; j > -1; j--) {
    // if (nums[i] == nums[j]&i!=0) {
    // check = false;
    // j = 0;
    // }
    // }
    // if (check) {
    // for (int j = i; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {
    // sum = sum + 1;

    // }

    // }
    // }
    // if (result < sum) {
    // result = sum;
    // value = nums[i];

    // }
    // }

    // return value;
    // }

    public static int majorityElement(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sum = sum + 1;
                }
            }

            if (sum > (nums.length / 2)) {
                result = nums[i];
            }

        }
        return result;
    }
}
