import java.util.*;

public class FourSum {

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        System.out.println(fourSum(nums, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <nums.length; j++) {
                int l = j + 1;
                int k = nums.length - 1;

                while (l < k) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[l];
                    sum += nums[k];

                    if (sum == target) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[l], nums[k]));
                        l++;
                        k--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        k--;
                    }
                }
            }
        }

        result.addAll(set);
        return result;
    }
}
