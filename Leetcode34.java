public class Leetcode34 {

    public int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int first = -1;

        // Search for the first occurrence
        while (s <= e) {
            int mid = (s + e) / 2;

            if (nums[mid] == target) {
                first = mid;
                e = mid - 1;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        s = 0;
        e = nums.length - 1;
        int last = -1;

        // Search for the last occurrence
        while (s <= e) {
            int mid = (s + e) / 2;

            if (nums[mid] == target) {
                last = mid;
                s = mid + 1;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return new int[]{first, last};
    }


    public static void main(String[] args) {
        Leetcode34 solution = new Leetcode34();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = solution.searchRange(nums, target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
