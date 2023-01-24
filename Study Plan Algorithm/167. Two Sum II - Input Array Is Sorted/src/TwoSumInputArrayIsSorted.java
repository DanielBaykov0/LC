import java.util.Arrays;

public class TwoSumInputArrayIsSorted {

    public static void main(String[] args) {

        int[] arr = {0,0,3,4};
        int target = 0;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {left + 1, right + 1};
    }
}
