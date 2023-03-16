import java.util.Arrays;

public class CheckIfAStringCanBreakAnotherString {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "xya";
        System.out.println(checkIfCanBreak(s1, s2));
    }

    public static boolean checkIfCanBreak(String s1, String s2) {

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int a1 = 0;
        int b1 = 0;

        for (int i = 0; i < a.length; i++) {
            int diff = a[i] - b[i];

            if (diff >= 0) {
                a1++;
            }

            if (diff <= 0) {
                b1++;
            }
        }

        return a1 == a.length || b1 == b.length;
    }
}
