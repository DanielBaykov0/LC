import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {

    public static void main(String[] args) {

        int[] piles = {2, 4, 1, 2, 7, 8};
        System.out.println(maxCoins(piles));
    }

    public static int maxCoins(int[] piles) {

        int result = 0;
        int start = 0;
        int end = piles.length - 1;

        Arrays.sort(piles);

        while (start < end) {
            result += piles[end - 1];
            end -= 2;
            start++;
        }

        return result;
    }
}
