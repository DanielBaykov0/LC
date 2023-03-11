public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {

        int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;

        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        return product - sum;
    }
}
