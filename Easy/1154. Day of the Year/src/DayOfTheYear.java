public class DayOfTheYear {

    public static void main(String[] args) {

        String s = "2004-03-01";

        System.out.println(dayOfYear(s));
    }

    public static int dayOfYear(String date) {
        String[] s = date.split("-");
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);
        boolean isLeap = isLeapYear(year);
        int noOfDays = 0;

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month - 1; i++) {
            if (isLeap && i == 1) {
                noOfDays += days[i] + 1;
                continue;
            }

            noOfDays += days[i];
        }

        return noOfDays + day;
    }

    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
