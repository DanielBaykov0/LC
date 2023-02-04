public class SearchRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(srch(nums, 0));
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] == target) {
                return start;
            }

            if (nums[end] == target) {
                return end;
            }

            start++;
            end--;
        }

        return -1;
    }

    public static int srch(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
