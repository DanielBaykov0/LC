public class NumberOfStepsToReduceNumberToZero {

    public static void main(String[] args) {

        int num = 14;
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {

        int count = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num -= 1;
            }

            count++;
        }

        return count;
    }
}
