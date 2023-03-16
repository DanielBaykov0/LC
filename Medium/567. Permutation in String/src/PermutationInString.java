public class PermutationInString {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] int1 = new int[26];
        int[] int2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            int1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (i >= s1.length()) {
                int2[s2.charAt(i - s1.length()) - 'a']--;
            }

            int2[s2.charAt(i) - 'a']++;

            if (isPermutation(int1, int2)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isPermutation(int[] int1, int[] int2) {
        for (int i = 0; i < 26; i++) {
            if (int1[i] != int2[i]) {
                return false;
            }
        }

        return true;
    }
}
