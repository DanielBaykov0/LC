public class MoveZeroes {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void moveZeroes(int[] arr) {

        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (zero > 0) {
                int temp = arr[i];
                arr[i] = 0;
                arr[i - zero] = temp;
            }
        }
    }
}
