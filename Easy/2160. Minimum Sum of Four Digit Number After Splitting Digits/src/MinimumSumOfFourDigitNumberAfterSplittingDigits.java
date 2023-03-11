import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

    public static void main(String[] args) {

        int num = 2932;
        System.out.println(minimumSum(num));
    }

    public static int minimumSum(int num) {

        int[] nums = new int[4];
        int count = 0;
        while (num > 0) {
            nums[count++] = num % 10;
            num /= 10;
        }

        Arrays.sort(nums);
        return (nums[0] * 10 + nums[2]) + (nums[1] * 10 + nums[3]);
    }
}
