public class ToLowerCase {

    public static void main(String[] args) {

        String s = "HELLO";

        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {

        return s.toLowerCase();
    }

    public String toLowerCaseASCII(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 90 && arr[i] >= 65) {     // or arr[i] <= 'Z' && arr[i] >= 'A'
                arr[i] += 32;                       // arr[i] <= 122 && >= 97
            }
        }

        return new String(arr);
    }
}
