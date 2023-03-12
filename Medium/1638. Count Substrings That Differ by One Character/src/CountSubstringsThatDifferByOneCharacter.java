public class CountSubstringsThatDifferByOneCharacter {

    public static void main(String[] args) {

        String s = "aba";
        String t = "baba";
        System.out.println(countSubstrings(s, t));
    }

    public static int countSubstrings(String s, String t) {

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += helper(s, t, i, 0);
        }

        for (int j = 1; j < t.length(); j++) {
            res += helper(s, t, 0, j);
        }

        return res;
    }

    private static int helper(String s, String t, int i, int j) {

        int res = 0;
        int pre = 0;
        int cur = 0;

        for (int n = s.length(), m = t.length(); i < n && j < m; i++, j++) {
            cur++;
            if (s.charAt(i) != t.charAt(j)) {
                pre = cur;
                cur = 0;
            }

            res += pre;
        }

        return res;
    }
}
