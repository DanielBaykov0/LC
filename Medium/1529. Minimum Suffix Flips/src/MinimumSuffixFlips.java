public class MinimumSuffixFlips {

    public static void main(String[] args) {

        String target = "10111";
        System.out.println(minFlips(target));
    }

    public static int minFlips(String target) {

        int count = 0;
        int prev = 0;

        for (char c : target.toCharArray()) {
            if (c - '0' != prev) {
                prev = c - '0';
                count++;
            }
        }

        return count;
    }
}
