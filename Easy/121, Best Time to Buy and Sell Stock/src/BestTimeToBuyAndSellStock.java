public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] prices = {2, 4, 1};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > max) {
                max = price - min;
            }

            System.out.println("min=" + min);
            System.out.println("max=" + max);
        }

        return max;
    }
}
