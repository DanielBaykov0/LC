public class PlusOne {

    public static void main(String[] args) {

    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newInt = new int[digits.length - 1];
        newInt[0] = 1;
        return newInt;
    }
}
