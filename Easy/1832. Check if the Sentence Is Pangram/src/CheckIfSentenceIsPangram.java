import java.util.HashSet;
import java.util.Set;

public class CheckIfSentenceIsPangram {

    public static void main(String[] args) {

        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {

        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            set.add(c);
        }

        return set.size() == 26;
    }
}
