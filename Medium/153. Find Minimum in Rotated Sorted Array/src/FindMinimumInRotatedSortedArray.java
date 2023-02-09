public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[start] <= nums[end]) {
                return nums[0];
            }

            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else if (nums[mid] <= nums[end]) {
                end = mid - 1;
            }
        }

        return -1;
    }
}
