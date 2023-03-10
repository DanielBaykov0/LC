import java.util.Arrays;

public class LeftAndRightSumDifferences {

    public static void main(String[] args) {

        int[] nums = {10, 4, 8, 3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    public static int[] leftRightDifference(int[] nums) {

        int[] ans = new int[nums.length];
        int[] leftSum = new int[nums.length];
        leftSum[0] = 0;
        int[] rightSum = new int[nums.length];
        rightSum[nums.length - 1] = 0;

        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}
