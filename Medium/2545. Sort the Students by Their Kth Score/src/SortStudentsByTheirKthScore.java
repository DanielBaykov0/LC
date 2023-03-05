import java.util.Arrays;
import java.util.Comparator;

public class SortStudentsByTheirKthScore {

    public static void main(String[] args) {

        int[][] score = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
        int k = 2;
        System.out.println(Arrays.deepToString(sortTheStudents(score, k)));

    }

    public static int[][] sortTheStudents(int[][] score, int k) {

        Arrays.sort(score, Comparator.comparingDouble(a -> a[k]));
        int i = 0;
        int j = score.length - 1;

        while (i < j) {
            int[] temp = score[i];
            score[i] = score[j];
            score[j] = temp;
            i++;
            j--;
        }

        return score;
    }
}
