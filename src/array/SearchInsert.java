package array;

public class SearchInsert {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6, 7 }, 4));
    }

    public static int searchInsert(int[] nums, int target) {
        return binaryInsert(nums, target, 0, nums.length - 1);
    }

    public static int binaryInsert(int[] nums, int target, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binaryInsert(nums, target, mid + 1, high);
            } else {
                return binaryInsert(nums, target, low, mid - 1);
            }

        } else {
            return low;
        }

    }
}
