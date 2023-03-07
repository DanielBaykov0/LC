import java.util.HashMap;

public class NumberOfPairsStringsWithConcatenationEqualTarget {

    public static void main(String[] args) {

        String[] nums = {"777", "7", "77", "77"};
        String target = "7777";
        System.out.println(numOfPairs(nums, target));
    }

    public static int numOfPairs(String[] nums, String target) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    String s = nums[i] + nums[j];

                    if (s.equals(target)) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    public int pairs(String[] nums, String target) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int indx = 0; indx < nums.length; indx++) {
            map.put(nums[indx], map.getOrDefault(nums[indx], 0) + 1);
        }


        for (String str : nums) {
            if (target.startsWith(str)) {
                if (map.get(target.substring(str.length())) != null) {
                    count += map.get(target.substring(str.length()));
                    if (str.equals(target.substring(str.length()))) count--;
                }
            }
        }

        return count;
    }
}
