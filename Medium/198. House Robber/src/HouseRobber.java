public class HouseRobber {

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {

        int prev1 = 0;
        int prev2 = 0;

        for (int num : nums) {
            int max = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = max;
        }

        return prev1;
    }
}
