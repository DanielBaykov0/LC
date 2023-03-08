import java.util.HashSet;
import java.util.Set;

public class CountNumberDistinctIntegersAfterReverseOperations {

    public static void main(String[] args) {

        int[] nums = {1, 13, 10, 12, 31};
        System.out.println(countDistinctIntegers(nums));
    }

    public static int countDistinctIntegers(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (Integer n : nums) {
            set.add(n);
            set.add(reverse(n));
        }

        return set.size();
    }

    private static int reverse(int num) {

        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }

        return rev;
    }
}
