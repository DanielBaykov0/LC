public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

        String s = "ZY";

        System.out.println(titleToNumber(s));
    }

    public static int titleToNumber(String columnTitle) {

        int sum = 0;

        for (char c : columnTitle.toUpperCase().toCharArray()) {

            sum = sum * 26 + (c - 'A' + 1);
        }

        return sum;
    }
}
