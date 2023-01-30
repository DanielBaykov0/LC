import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

    public static void main(String[] args) {

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        System.out.println(mostCommonWord(paragraph, banned));
    }

    public static String mostCommon(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for (String s : banned) {
            set.add(s);
        }

        Map<String, Integer> map = new HashMap<>();
        String[] par = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ");

        for (String w : par) {
            if (!set.contains(w)) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String key : map.keySet()) {
            if (sb.toString().equals("") || map.get(key) > map.get(sb.toString())) {
                sb.setLength(0);
                sb.append(key);
            }
        }

        return sb.toString();
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : banned) {
            if (map.containsKey(word)) {
                map.remove(word);
            }
        }

        String result = null;
        for (String word : map.keySet()) {
            if (result == null || map.get(word) > map.get(result)) {
                result = word;
            }
        }

        return result;
    }
}
