public class FibonacciNumber {

    public static void main(String[] args) {

        int num = 4;
        System.out.println(fib(num));
    }

    public static int checkFibonacciNumber(int num) {

        if (num < 2) {
            return num;
        }

        return checkFibonacciNumber(num - 1) + checkFibonacciNumber(num - 2);
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return n3;
    }
}
