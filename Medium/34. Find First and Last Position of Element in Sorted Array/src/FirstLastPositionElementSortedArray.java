import java.util.Arrays;

public class FirstLastPositionElementSortedArray {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};

        System.out.println(Arrays.toString(searchRange(nums, 6)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int ff = findFirst(nums, target);
        int fl = findLast(nums, target);

        return new int[]{ff, fl};
    }

    public static int findFirst(int[] nums, int target) {

        int start = 0;
        int end = 0;
        int index = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
        }

        return index;
    }

    public static int findLast(int[] nums, int target) {

        int start = 0;
        int end = 0;
        int index = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
        }

        return index;
    }
}
