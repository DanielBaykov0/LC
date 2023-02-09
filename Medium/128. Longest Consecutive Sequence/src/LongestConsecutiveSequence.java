import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int max = 0;
        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int count = 1;

                while (set.contains(i + 1)) {
                    count++;
                    i++;
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }
}
