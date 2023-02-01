import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {6, 5, 5};

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        int element = -1;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                element = num;
            }

            if (element == num) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }

    public static int majority(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) > nums.length / 2) {
                return i;
            }
        }

        return -1;
    }
}
