public class MinimumNumberStepsToMakeTwoStringsAnagramII {

    public static void main(String[] args) {

        String s = "leetcode";
        String t = "coats";
        System.out.println(minSteps(s, t));
    }

    public static int minSteps(String s, String t) {

        int count = 0;
        int[] chars = new int[26];

        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            chars[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (chars[i] != 0) {
                count += Math.abs(chars[i]);
            }
        }

        return count;
    }
}
