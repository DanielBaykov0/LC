public class MinimumNumberOperationsToReinitializePermutation {

    public static void main(String[] args) {

        int n = 4;
        System.out.println(reinitializePermutation(4));
    }

    public static int reinitializePermutation(int n) {

        int temp = n / 2;
        int count = 1;

        while (temp != 1) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = n / 2 + (temp + 1) / 2;
            }
            count++;
        }

        return count;
    }
}
