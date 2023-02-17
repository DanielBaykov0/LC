import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {


        int n  = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    public static int getNext(int n) {

        int sum = 0;

        while (n > 0) {
            int remainder = n % 10;
            sum += remainder * remainder;
            n /= 10;
        }

        return sum;
    }
}
