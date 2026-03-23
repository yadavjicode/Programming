package array;

import java.util.Arrays;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
i
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

*/

public class SearchRange {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[] {}, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        return binaryInsert(nums, target, 0, nums.length - 1);
    }

    public static int[] binaryInsert(int[] nums, int target, int low, int high) {

        if (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {

                System.err.println(mid);
                // a[0] = mid;
                int last = mid;
                int start = mid;

                while (((last + 1) < nums.length) && (nums[last + 1] == target)) {
                    last++;
                }

                while (((start - 1) > -1) && (nums[start - 1] == target)) {
                    start--;
                }

                return new int[] { start, last };

            } else if (nums[mid] < target) {

                return binaryInsert(nums, target, mid + 1, high);

            } else {

                return binaryInsert(nums, target, low, mid - 1);
            }
        } else {

            return new int[] { -1, -1 };
        }
    }
}
