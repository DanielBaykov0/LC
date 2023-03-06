import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static void main(String[] args) {

        String s = "a1b2";
        System.out.println(letterCasePermutation(s));
    }

    public static List<String> letterCasePermutation(String s) {

        List<String> list = new ArrayList<>();
        backtrack(list, 0, s.toCharArray());
        return list;
    }

    private static void backtrack(List<String> list, int i, char[] s) {

        if (i == s.length) {
            list.add(new String(s));
        } else {
            if (Character.isLetter(s[i])) {
                s[i] = Character.toUpperCase(s[i]);
                backtrack(list, i + 1, s);
                s[i] = Character.toLowerCase(s[i]);
                backtrack(list, i + 1, s);
            } else {
                backtrack(list, i + 1, s);
            }
        }
    }
}
