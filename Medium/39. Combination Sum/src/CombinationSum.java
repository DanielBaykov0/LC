import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {

        int[] candidates = {2, 3, 5};
        int target = 8;

        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        recurstion(new ArrayList<>(), 0, 0, candidates, target);
        return result;
    }

    public static void recurstion(List<Integer> list, int index, int sum, int[] candidates, int target) {

        if (sum == target) {
            result.add(new ArrayList<>(list));
        }

        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                continue;
            }

            list.add(candidates[i]);
            recurstion(list, i, sum + candidates[i], candidates, target);
            list.remove(list.size() - 1);
        }
    }
}
