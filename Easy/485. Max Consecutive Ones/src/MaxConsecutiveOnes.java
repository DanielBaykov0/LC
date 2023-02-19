public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
