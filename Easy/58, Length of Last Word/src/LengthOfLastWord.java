public class LengthOfLastWord {

    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
}
