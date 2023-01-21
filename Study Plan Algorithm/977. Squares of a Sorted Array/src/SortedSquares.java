import java.util.Arrays;
import java.util.Scanner;

public class SortedSquares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();

        sort(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    public static int[] sort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            int newElement = nums[i];

            int j;
            for (j = i; j > 0 && nums[j - 1] > newElement; j--) {
                nums[j] = nums[j - 1];
            }

            nums[j] = newElement;
        }

        return nums;
    }
}
