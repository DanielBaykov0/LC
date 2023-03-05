public class MinimumOperationsToMakeArrayEqual {

    public static void main(String[] args) {

        int n = 6;
        System.out.println(minOperations(n));
    }

    public static int minOperations(int n) {

        int mid = n / 2;
        return mid * (mid + n % 2);
    }
}
