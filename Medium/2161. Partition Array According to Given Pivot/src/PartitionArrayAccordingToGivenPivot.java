import java.util.Arrays;

public class PartitionArrayAccordingToGivenPivot {

    public static void main(String[] args) {

        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;

        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {

        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[start++] = nums[i];
            }

            if (nums[nums.length - i - 1] > pivot) {
                result[end--] = nums[nums.length - i - 1];
            }
        }

        while (start <= end) {
            result[start++] = pivot;
            result[end--] = pivot;
        }

        return result;
    }
}
