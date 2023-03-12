public class DifferenceBetweenElementSumAndDigitSumOfArray {

    public static void main(String[] args) {

        int[] nums = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums));
    }

    public static int differenceOfSum(int[] nums) {

        int elementSum = 0;
        int digitSum = 0;
        int digit = 0;

        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];

            while (nums[i] > 0) {
                digit = nums[i] % 10;
                digitSum += digit;
                nums[i] /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}
