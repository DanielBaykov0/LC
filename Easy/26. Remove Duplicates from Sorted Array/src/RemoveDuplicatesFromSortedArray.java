import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};

        System.out.println(rmvDup(nums));

    }

//    public static int removeDuplicates(int[] nums) {
//
//        Stack<Integer> stack = new Stack<>();
//        stack.add(nums[0]);
//
//        for (int i = 1; i < nums.length; i++) {
//            while (!stack.isEmpty() && stack.peek() == nums[i]) {
//                stack.pop();
//            }
//
//            stack.push(nums[i]);
//        }
//
//        int[] arr = new int[stack.size()];
//
//        for (int i = arr.length - 1; i > 0; i--) {
//            arr[i] = stack.pop();
//        }
//
//        System.out.println(Arrays.toString(arr));
//        return arr.length;
//    }

    public static int remDuplicates(int[] nums) {
        int c = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) nums[c++] = nums[i + 1];
        }
        return c;
    }

    public static int removeDup(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = 1;
        int count = 1;
        while (end < n) {
            if (nums[start] == nums[end]) {
                end++;
            } else {
                start++;
                nums[start] = nums[end];
                count++;
            }

        }
        return count;
    }

    public static int rmvDup(int[] nums) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int[] arr = new int[set.size()];
        int i = 0;

        for (int element : set) {
            arr[i++] = element;
        }

        System.out.println(Arrays.toString(arr));
        return set.size();
    }

    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int j = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]) {
                nums[++idx] = nums[i];
                j = i;
            }
        }

        return ++idx;
    }
}
