import java.util.Arrays;

public class RearrangeArrayElementsBySign {

    public static void main(String[] args) {

        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {

        int even = 0;
        int odd = 1;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[even] = nums[i];
                even += 2;
            } else if (nums[i] < 0) {
                result[odd] = nums[i];
                odd += 2;
            }
        }

        return result;
    }
}
