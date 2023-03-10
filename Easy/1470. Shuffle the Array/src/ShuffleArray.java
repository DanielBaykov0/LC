import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2};
        int n = 2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[nums.length];
        int j = 0;

        for (int i = 0; i < n; i++) {
            ans[j++] = nums[i];
            ans[j++] = nums[i + n];
        }

        return ans;
    }
}
