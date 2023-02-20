public class LongestUncommonSubsequenceI {

    public static void main(String[] args) {

        String a = "aba";
        String b = "cdc";
        System.out.println(findLUSlength(a, b));
    }

    public static int findLUSlength(String a, String b) {

        if (a.equals(b)) {
            return -1;
        }

        return Math.max(a.length(), b.length());
    }
}
