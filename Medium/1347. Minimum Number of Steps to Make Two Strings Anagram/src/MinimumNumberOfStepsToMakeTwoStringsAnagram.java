public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

    public static void main(String[] args) {

    }

    public static int minSteps(String s, String t) {

        int[] result = new int[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
            result[t.charAt(i) - 'a']--;
        }

        for (int n : result) {
            if (n > 0) {
                count += n;
            }
        }

        return count;
    }
}
