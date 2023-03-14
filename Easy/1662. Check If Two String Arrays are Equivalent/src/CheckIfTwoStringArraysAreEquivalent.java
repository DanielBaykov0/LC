public class CheckIfTwoStringArraysAreEquivalent {

    public static void main(String[] args) {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String ans1 = "";
        String ans2 = "";

        for (String s : word1) {
            ans1 += s;
        }

        for (String s : word2) {
            ans2 += s;
        }

        return ans1.equals(ans2);
    }
}
