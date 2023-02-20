import java.util.Arrays;

public class NumberOfLinesToWriteString {

    public static void main(String[] args) {

        int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(Arrays.toString(numberOfLines(widths, s)));
    }

    public static int[] numberOfLines(int[] widths, String s) {

        int sum = 0;
        int lineCounter = 1;

        for (char c : s.toCharArray()) {
            int currentCharLen = widths[c - 'a'];
            if (sum + currentCharLen <= 100) {
                sum += currentCharLen;
            } else {
                lineCounter++;
                sum = currentCharLen;
            }
        }

        return new int[]{lineCounter, sum};
    }
}
