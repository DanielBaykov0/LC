import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThanCurrentNumber {

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThatCurrent(nums)));
    }

    public static int[] smallerNumbersThatCurrent(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = nums.clone();

        Arrays.sort(ans);
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(ans[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = map.get(nums[i]);
        }

        return ans;
    }
}
