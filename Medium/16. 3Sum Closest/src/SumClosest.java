import java.util.Arrays;

public class SumClosest {

    public static void main(String[] args) {

        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {

        int diff = Integer.MAX_VALUE;
        int sum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }

                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return target - diff;
    }
}
