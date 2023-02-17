public class AddDigits {

    public static void main(String[] args) {

        int num = 38;
        System.out.println(addDigit(num));
    }

    public static int addDigit(int num) {

        int sum = 0;

        while (num > 0) {
            int remainder = num % 10;
            sum += remainder;
            num /= 10;
        }

        if (sum / 10 == 0) {
            return sum;
        } else {
            return addDigit(sum);
        }
    }
}
