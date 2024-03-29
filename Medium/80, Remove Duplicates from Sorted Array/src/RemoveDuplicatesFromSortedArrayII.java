public class RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int num : nums) {
            if (i < 2 || num > nums[i - 2]) {
                nums[i++] = num;
            }
        }

        return i;
    }
}
