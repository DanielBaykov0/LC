import java.util.Arrays;

public class FindTheDifference {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";

        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        int s_pointer = 0;
        int t_pointer = 0;

        while (s_pointer < s.length()) {
            if (first[s_pointer] != second[t_pointer]) {
                return second[t_pointer];
            }

            s_pointer++;
            t_pointer++;
        }

        return second[t.length() - 1];
    }
}
