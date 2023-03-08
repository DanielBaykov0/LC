import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {

    public static void main(String[] args) {

        int[] nums = {3, 5, 4, 2, 4, 6};
        System.out.println(minPairSum(nums));
    }

    public static int minPairSum(int[] nums) {

        int max = 0;
        int start = 0;
        int end = nums.length - 1;

        Arrays.sort(nums);

        while (start < end) {
            max = Math.max(max, nums[start++] + nums[end--]);
        }

        return max;
    }
}
