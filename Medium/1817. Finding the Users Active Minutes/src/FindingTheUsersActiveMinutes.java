import java.util.*;

public class FindingTheUsersActiveMinutes {

    public static void main(String[] args) {

        int[][] logs = {{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}};
        int k = 5;
        System.out.println(Arrays.toString(findingUsersActiveMinutes(logs, k)));
    }

    public static int[] findingUsersActiveMinutes(int[][] logs, int k) {

        Map<Integer, Set<Integer>> map = new HashMap<>();

        int[] result = new int[k];

        for (int i = 0; i < logs.length; i++) {
            map.putIfAbsent(logs[i][0], new HashSet<>());
            map.get(logs[i][0]).add(logs[i][1]);
        }

        for (int i : map.keySet()) {
            result[map.get(i).size() - 1]++;
        }

        return result;
    }
}
