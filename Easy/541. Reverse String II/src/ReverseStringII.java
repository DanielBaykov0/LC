public class ReverseStringII {

    public static void main(String[] args) {

        String s = "abcdefg";

        System.out.println(reverse(s, 2));
    }

    public static String reverse(String s, int k) {

        char[] arr = s.toCharArray();
        int i = 0;
        int length = arr.length;

        while (i < length) {
            int j = Math.min(i + k - 1, length - 1);
            swap(arr, i, j);
            i += 2 * k;
        }

        return String.valueOf(arr);
    }

    private static void swap(char[] arr, int i, int j) {

        while (i < j) {
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        while (s.length() >= 2 * k) {
            String temp = s.substring(0, k);
            sb.append(new StringBuilder(temp).reverse());
            sb.append(s.substring(k, 2 * k));
            s = s.substring(2 * k);
        }
        if (s.length() <= k) {
            sb.append(new StringBuilder(s).reverse());
        } else {
            sb.append(new StringBuilder(s.substring(0, k)).reverse());
            sb.append(s.substring(k));
        }
        return sb.toString();
    }
}
