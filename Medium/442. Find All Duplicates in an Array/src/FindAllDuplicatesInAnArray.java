import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new LinkedList<>();
        int[] result = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            if (result[nums[i]] == 0) {
                result[nums[i]] += 1;
            } else {
                list.add(nums[i]);
            }
        }

        return list;
    }
}
