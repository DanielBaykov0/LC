import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static void main(String[] args) {

        int[] candyType = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(candyType));
    }

    public static int distributeCandies(int[] candyType) {

        Set<Integer> set = new HashSet<>();

        for (int i : candyType) {
            set.add(i);
        }

        return Math.min(set.size(), candyType.length / 2);
    }
}
