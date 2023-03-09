public class PartitionArrayForMaximumSum {

    public static void main(String[] args) {

        int[] arr = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;
        System.out.println(maxSumAfterPartitioning(arr, k));
    }

    public static int maxSumAfterPartitioning(int[] arr, int k) {

        int n = arr.length;
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            int maxSum = Integer.MIN_VALUE;
            int maxi = Integer.MIN_VALUE;
            int length = 0;
            for (int j = i; j < Math.min(n, i + k); j++) {
                length++;
                maxi = Math.max(maxi, arr[j]);
                int sum = (length * maxi) + dp[j + 1];
                maxSum = Math.max(maxSum, sum);
            }

            dp[i] = maxSum;
        }

        return dp[0];
    }
}
