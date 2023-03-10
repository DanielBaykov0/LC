import java.util.Arrays;

public class PartitionArraySuchThatMaximumDifferenceIsK {

    public static void main(String[] args) {

        int[] nums = {3, 6, 1, 2, 5};
        int k = 2;
        System.out.println(partitionArray(nums, k));
    }

    public static int partitionArray(int[] nums, int k) {

        Arrays.sort(nums);

        int start = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - start > k) {
                count++;
                start = nums[i];
            }
        }

        return count;
    }
}
