public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        rotateRight(arr, 3);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void rotateRight(int[] arr, int k) {
        int length = arr.length;
        k = k % length;

        int[] array = new int[length];
        int j = 0;
        for (int i = length - k; i < length; i++) {
            array[j++] = arr[i % length];
        }

        for (int i = 0; i < length - k; i++) {
            array[j++] = arr[i % length];
        }

        j = 0;
        for (int i : array) {
            arr[j++] = i;
        }
    }
}
