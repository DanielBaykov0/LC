public class MinimumAdjacentSwapsToReachKthSmallestNumber {

    public static void main(String[] args) {

        String num = "5489355142";
        int k = 4;
        System.out.println(getMinSwaps(num, k));
    }

    public static int getMinSwaps(String num, int k) {

        int[] original = new int[num.length()];
        int[] nums = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            nums[i] = num.charAt(i) - '0';
            original[i] = num.charAt(i) - '0';
        }

        while (k-- > 0) {
            nextPermutation(nums);
        }

        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            if (nums[i] != original[i]) {
                int j = i;

                while (nums[j] != original[i]) {
                    j++;
                }

                for (int h = j; h > i; h--) {
                    swap(nums, h, h -1);
                    result++;
                }
            }
        }

        return result;
    }

    public static void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;

            while (j > i && nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i + 1, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
