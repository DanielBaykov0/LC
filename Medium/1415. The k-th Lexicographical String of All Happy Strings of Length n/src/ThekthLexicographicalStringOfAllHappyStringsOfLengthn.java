import java.util.ArrayList;
import java.util.List;

public class ThekthLexicographicalStringOfAllHappyStringsOfLengthn {

    public static void main(String[] args) {

        int n = 3;
        int k = 9;
        System.out.println(getHappyString(n, k));
    }

    public static String getHappyString(int n, int k) {

        char[] arr = {'a', 'b', 'c'};
        String res = "";
        List<String> list = new ArrayList<>();
        generatePerm(arr, n, res, list);

        if (list.size() >= k) {
            res = list.get(k - 1);
        }

        return res;
    }

    private static void generatePerm(char[] arr, int n, String res, List<String> list) {
        if (n == 0) {
            list.add(res);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (res == "" || res.charAt(res.length() - 1) != arr[i]) {
                String pre = res + arr[i];
                generatePerm(arr, n - 1, pre, list);
            }
        }
    }
}
