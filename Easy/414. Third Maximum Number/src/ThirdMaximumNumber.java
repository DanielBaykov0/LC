import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMaximumNumber {

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 1};

        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.add(n)) {
                priorityQueue.add(n);
            }
        }

        if (priorityQueue.size() < 3) {
            return priorityQueue.peek();
        }

        priorityQueue.remove();
        priorityQueue.remove();
        return priorityQueue.remove();
    }
}
