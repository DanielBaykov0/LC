import java.util.*;

public class RelativeRanks {

    public static void main(String[] args) {

        int[] score = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] score) {

        String[] s = new String[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : score) {
            priorityQueue.add(i);
        }

        Map<Integer, String> map = new HashMap<>();
        int index = 1;

        while (!priorityQueue.isEmpty()) {
            if (index == 1) {
                map.put(priorityQueue.remove(), "Gold Medal");
            } else if (index == 2) {
                map.put(priorityQueue.remove(), "Silver Medal");
            } else if (index == 3) {
                map.put(priorityQueue.remove(), "Bronze Medal");
            } else {
                map.put(priorityQueue.remove(), Integer.toString(index));
            }

            index++;
        }

        for (int i = 0; i < score.length; i++) {
            s[i] = map.get(score[i]);
        }

        return s;
    }
}
