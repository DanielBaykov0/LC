import java.util.HashSet;
import java.util.Set;

public class OptimalPartitionOfString {

    public static void main(String[] args) {

        String s = "abacaba";
        System.out.println(partitionString(s));
    }

    public static int partitionString(String s) {

        int count = (s.isEmpty()) ? 0 : 1;
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.clear();
                count++;
            }

            set.add(c);
        }

        return count;
    }
}
