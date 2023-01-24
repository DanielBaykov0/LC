public class ReverseString {

    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};

        reverse(s);
        reverseString(s);

        for (char c : s) {
            System.out.print(c + " ");
        }
    }

    public static void reverse(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left <= right) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;

            left++;
            right--;
        }
    }
}
