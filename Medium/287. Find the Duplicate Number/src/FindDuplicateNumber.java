public class FindDuplicateNumber {

    public static void main(String[] args) {

        int[] nums = {3, 1, 3, 4, 2};

        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {

        int slow = 0;
        int slow2 = 0;
        int fast = 0;

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }
        }

        while (true) {
            slow = nums[slow];
            slow2 = nums[slow2];
            if (slow == slow2) {
                break;
            }
        }

        return slow;
    }
}
