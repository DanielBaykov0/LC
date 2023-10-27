public class ReverseWordsInAString {

    public static void main(String[] args) {

        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String ans = "";

        for (int i = str.length - 1; i > 0; i--) {
            ans += str[i] + " ";
        }

        return ans + str[0];
    }
}
