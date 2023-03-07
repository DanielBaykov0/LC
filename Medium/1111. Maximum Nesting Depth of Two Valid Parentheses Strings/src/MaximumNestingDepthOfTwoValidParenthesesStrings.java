import java.util.Arrays;

public class MaximumNestingDepthOfTwoValidParenthesesStrings {

    public static void main(String[] args) {

        String seq = "()(())()";
        System.out.println(Arrays.toString(maxDepthAfterSplit(seq)));
    }

    public static int[] maxDepthAfterSplit(String seq) {

        char[] chars = seq.toCharArray();
        int depth = 0;
        int[] result = new int[seq.length()];

        for (int i = 0; i < seq.length(); i++) {
            if (chars[i] == '(') {
                result[i] = depth++ % 2;
            } else {
                result[i] = --depth % 2;
            }
        }

        return result;
    }
}
