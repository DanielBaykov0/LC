public class ReverseWordsInString {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";


        System.out.println(reverseString(s));
    }

    public static String reverse(String s) {

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        return String.join(" ", words);
    }

    public static String reverseString(String s) {

        char[] chars = s.toCharArray();

        int start = 0;
        int end;
        for (end = 0; end <= chars.length; end++) {
            if (end == chars.length || chars[end] == ' ') {
                rev(chars, start, end - 1);
                start = end + 1;
            }
        }

        return new String(chars);
    }

    private static void rev(char[] c, int start, int end) {

        while (start <= end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;
        }
    }
}
