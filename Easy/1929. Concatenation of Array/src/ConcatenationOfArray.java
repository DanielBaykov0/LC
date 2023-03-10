import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {

        int[] result = new int[2 * nums.length];

        for (int i = 0; i < nums.length * 2; i++) {
            if (i < nums.length) {
                result[i] = nums[i];
            } else {
                result[i] = nums[i - nums.length];
            }
        }

        return result;
    }
}
