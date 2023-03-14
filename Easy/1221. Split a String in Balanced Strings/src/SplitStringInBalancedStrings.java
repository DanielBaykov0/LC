public class SplitStringInBalancedStrings {

    public static void main(String[] args) {

        String s = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {

        int ch = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                ch++;
            } else {
                ch--;
            }

            if (ch == 0) {
                count++;
            }
        }

        return count;
    }
}
